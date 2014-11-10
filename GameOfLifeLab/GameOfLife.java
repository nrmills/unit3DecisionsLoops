import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;

    // the game board will have 5 rows and 5 columns
    private final int ROWS = 100;
    private final int COLS = 100;

    // constants for the location of the three cells initially alive
    private final int X1 = 5, Y1 = 5;
    private final int X2 = 6, Y2 = 5;
    private final int X3 = 7, Y3 = 5;
    private final int X4 = 5, Y4 = 6;
    private final int X5 = 6, Y5 = 6;
    private final int X6 = 7, Y6 = 6;
    private final int X7 = 5, Y7 = 7;
    private final int X8 = 6, Y8 = 7;
    private final int X9 = 7, Y9 = 7;

    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);

        // create a world based on the grid
        world = new ActorWorld(grid);

        // populate the game
        populateGame();

        // display the newly constructed and populated world
        world.show();

    }

    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();

        // create and add rocks (a type of Actor) to the nine intial locations
        Rock rock1 = new Rock();
        Location loc1 = new Location(X1, Y1);
        grid.put(loc1, rock1);

        Rock rock2 = new Rock();
        Location loc2 = new Location(X2, Y2);
        grid.put(loc2, rock2);

        Rock rock3 = new Rock();
        Location loc3 = new Location(X3, Y3);
        grid.put(loc3, rock3);
        
        Rock rock4 = new Rock();
        Location loc4 = new Location(X4, Y4);
        grid.put(loc4, rock4);

        Rock rock5 = new Rock();
        Location loc5 = new Location(X5, Y5);
        grid.put(loc5, rock5);

        Rock rock6 = new Rock();
        Location loc6 = new Location(X6, Y6);
        grid.put(loc6, rock6);
        
        Rock rock7 = new Rock();
        Location loc7 = new Location(X7, Y7);
        grid.put(loc7, rock7);

        Rock rock8 = new Rock();
        Location loc8 = new Location(X8, Y8);
        grid.put(loc8, rock8);

        Rock rock9 = new Rock();
        Location loc9 = new Location(X9, Y9);
        grid.put(loc9, rock9);
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    private void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         *
         *Rules:
         *1. Any live cell with fewer than two live neighbours dies, as if caused by under-population.
         *2. Any live cell with two or three live neighbours lives on to the next generation.
         *3. Any live cell with more than three live neighbours dies, as if by overcrowding.
         *4. Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.  
         *
         */

        
        // create the grid, of the specified size, that contains Actors
        //BoundedGrid<Actor> newGeneration = new BoundedGrid<Actor>(ROWS, COLS);
        
        Grid<Actor> grid = world.getGrid();
        Grid<Actor>newGeneration = grid;
        for (int numRow=0; numRow<=grid.getNumRows();numRow++)
        {
            for(int numCol=0; numCol<=grid.getNumCols();numCol++)
            {
                Location loc = new Location(numRow,numCol);
                boolean state = grid.isValid(loc);
                if (state == true)
                {
                    //Executes once outer for loops find a valid cell
                    for (int microRow= loc.getRow()-1; microRow<=numRow+2;microRow++)
                    {
                        for (int microCol=loc.getCol()-1; microCol<=numCol+2;microCol++)
                        {
                            Location microLocation= new Location(microCol,microRow);
                            if (grid.getValidAdjacentLocations(microLocation).size() == 3
                                    && grid.isValid(microLocation) == false)
                            {
                                Rock newRock = new Rock();
                                newGeneration.put(microLocation,newRock);
                            }
                            else if (grid.getValidAdjacentLocations(microLocation).size() > 3
                                    || grid.getValidAdjacentLocations(microLocation).size() < 2
                                    && grid.isValid(microLocation) == true)
                            {
                                newGeneration.remove(microLocation);
                            }
                        }
                    }
                }
            }
        }
        grid = newGeneration;
    }

    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }

    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }

    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        GameOfLife game = new GameOfLife();
        for (int x=0;x<10;x++)
        {
            Thread.sleep(500);
            game.createNextGeneration();
        }
    }

}
