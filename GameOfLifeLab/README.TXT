Finalized Requirements:
Q1: How large is the Grid? Is it boundless?
A1: 36x36, no.

Q2: What do the live cells look like?
A2: Black Blips.

Q3: What do dead cells look like? 
A3: Null, or a blank box

Q4: What pattern is displayed? are multiple patterns available?
are patterns chosen in code, chosen randomly, chosen by user?
A4: One pattern available

Q5: How long does the game run? does it run forever? Does it prompt
the user to continue?
A5: My game of life runs for 50 iterations

Q6: What is the time interval between generations?
A6: .5 Second Interval.

Q7: What about edge cases? does it wrap around?
A7: The edge is treated like the end of the world, cells cannot progress past it.





Introduction

The goal of this lab is to apply your understanding of decision and loop
	structures to implement a complex algorithm within the context of an
	unfamiliar and significant software framework (GridWorld). In addition,
	you will implement a unit test for your program using the JUnit framework
	and create documentation for your program using JavaDoc.


Requirements

Write a program that plays Conway’s Game of Life. Conway’s Game of Life is a
	cellular automaton. From Wikipedia:

The universe of the Game of Life is an infinite two-dimensional orthogonal
	grid of square cells, each of which is in one of two possible states,
	alive or dead. Every cell interacts with its eight neighbours, which are
	the cells that are horizontally, vertically, or diagonally adjacent. At
	each step in time, the following transitions occur:

* Any live cell with fewer than two live neighbours dies, as if caused by
	underpopulation.
* Any live cell with two or three live neighbours lives on to the next generation.
* Any live cell with more than three live neighbours dies, as if by overcrowding.
* Any dead cell with exactly three live neighbours becomes a live cell, as if
	by reproduction.
* The initial pattern constitutes the seed of the system. The first
	generation is created by applying the above rules simultaneously to every
	cell in the seed—births and deaths occur simultaneously, and the discrete
	moment at which this happens is sometimes called a tick (in other words,
	each generation is a pure function of the preceding one). The rules
	continue to be applied repeatedly to create further generations.


Nonfunctional Requirements:

* the program must be implemented in Java and utilize the GridWorld platform
* I recommend not use GridWorld’s execution engine to produce subsequent
	generations. It will be easier to implement the unit test if you directly
	produce and display subsequent generations.


Artifacts to Produce:

* Requirements Document: Many functional and nonfunctional requirements needs
	to be defined. You must define additional requirements that are
	reasonable and document them in a requirements document. I must review
	your requirements document before you start the design document or test
	plan. You may change the requirements document throughout development.
* Design Document: You must do some design activity before starting
	implementation. This may consist of a flow cart, pseudocode, or other
	design artifact. I must review your design document before you start
	implementing code. You may change your design document throughout
	development.
* Test Plan: You must create a test plan with specific test cases (at least
	two) before starting implementation. I must review your test plan before
	you start implementing your test class. You may change your test plan
	throughout development. The provided code in GitHub is an example of
	implementing an initial test case.
* GameOfLifeTest Test Class: JUnit-compatible test class that implements the
	test plan.
* GameOfLife class: You must produce a working class the meets the
	requirements and is verified and validated by your test plan.
* Reflection Document: This is a significant and challenging lab. Please
	reflect on this experience and share your feedback with me. What did you
	like or dislike and why? What was surprising or unexpected? What did you
	learn? What questions do you still have? What advice would you offer next
	year's students?
	
	Reflection:
	I had a very interesting and fun experience with this Game of Life Lab. The most interesting
	part of this lab was the brainstorming of the algorithm on paper, and testing my ideas on online
	simulations of Game of Life. I liked the localization of the documentation onto the computer 
	as opposed to looking for it online. While i didn't enjoy fine-tuning specific cases for the
	unit test, i thoroughly enjoyed the challenge of creating the algorithm for making new 
	generations. Another thing I disliked was the structuring of the grid (positioning of the
	x, and y-axis) I found it to be counter intuitive and confusing when trying to specify
	grid locations. The most unexpected problem that I had was trying to find the correct method to
	update the grid object, then figuring out it was buried just a little deeper in the documentation
	then I had looked. I dont have any standing questions- but my advice for students next year is the 
	method to update the grid with the changes made by one's algorithm.


Submission:

* Ensure the following artifacts have been committed to GitHub in addition to your code:
    * requirements document
    * design document (pseudocode, flow charts, etc.)
    * test plan (with specific test cases)
    * HTML documentation generated by JavaDoc
    * reflection document
* Submit a pull request in GitHub and submit a link to the request with this assignment.
