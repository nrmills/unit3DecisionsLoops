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
    private final int ROWS = 36;
    private final int COLS = 36;

    // 3x3 Block Pattern
    private final int X1 = 15, Y1 = 17;
    private final int X2 = 16, Y2 = 17;
    private final int X3 = 17, Y3 = 17;
    private final int X4 = 15, Y4 = 18;
    private final int X5 = 16, Y5 = 18;
    private final int X6 = 17, Y6 = 18;
    private final int X7 = 15, Y7 = 19;
    private final int X8 = 16, Y8 = 19;
    private final int X9 = 17, Y9 = 19;

    // Test Pattern
    //private final int X1 = 0, Y1 = 0;
    //private final int X2 = 1, Y2 = 0;
    //private final int X3 = 0, Y3 = 1;
    //private final int X4 = 2, Y4 = 1;
    //private final int X5 = 1, Y5 = 2;

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
     */
    public void createNextGeneration()
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

        Grid<Actor> grid = world.getGrid();
        BoundedGrid<Actor> newGrid = new BoundedGrid<Actor>(ROWS, COLS);
        for (int numRow=0; numRow<grid.getNumRows();numRow++)
        {
            for(int numCol=0; numCol<grid.getNumCols();numCol++)
            {
                Location loc = new Location(numRow,numCol);

                if (grid.get(loc) != null
                && (grid.getOccupiedAdjacentLocations(loc).size() > 3 
                    || grid.getOccupiedAdjacentLocations(loc).size() < 2))
                {
                    newGrid.remove(loc);
                }
                else if (grid.get(loc) != null 
                && (grid.getOccupiedAdjacentLocations(loc).size() == 3 
                    || grid.getOccupiedAdjacentLocations(loc).size() == 2))
                {
                    Rock newRock = new Rock();
                    newGrid.put(loc,newRock);
                }
                else if (grid.get(loc) == null 
                && grid.getOccupiedAdjacentLocations(loc).size() == 3)
                {
                    Rock newRock = new Rock();
                    newGrid.put(loc,newRock);
                }
            }
        }
        //Copy the Grid
        world.setGrid(newGrid);
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

        for (int x=0;x<50;x++)
        {
            Thread.sleep(500);
            game.createNextGeneration();
        }
    }

}
