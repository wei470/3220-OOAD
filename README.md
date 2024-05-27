# OOAD PROJECT CRASH course into OOP
school project comp 3220

A square shaped can be considered to be a specific type of a rectangle. This is a relationship we can "is-a", where a square "is-a" specific type of rectangle, particularly when all 4 sides are equal. In OOP this relationship is called Inheritance.

The same idea we can follow for a circle, which "is-a" specific type of an oval. 

We can also generalize where we can say all circles, ovals, squares and rectangles are different types of shapes.

Hence, shape is a general class. But can you draw a shape without knowing what specific shape you want to draw? thus a shape is what we call in OOP an abstract class - that is a class that cannot be instantiated.

However, in the spirit of programming in general, we want to create a shape factory where we can generate random shapes (with valid dimensions, i.e. no negative or zero sides or radius, and keep max dimension to 100, all integers).

Furthermore, adding one twist, if we have a canvas object, one can say that the canvas contains shapes or "has-a" list of shapes associated with it. This is a composition association in OOP, where a canvas contains, or "has-a" shape(s).

Shape is abstract class, and every shape has a unique id (an incrementing positive integer- Hint: use a static counter variable for this).

An Oval has a horizontal radius and a vertical radius. An Oval is a Shape.

A Circle is a specific type of Oval.

A Rectangle is a Shape with a value for length and width.

A Square is a Rectangle.

A Canvas has a list of 10 random Shape(s). There should be no duplicate shapes (ie. same dimensions of the same shape).

A Main instantiates a Canvas and displays its contents (in text as the example below:)

>> Canvas has the following random shapes:

Shape 1: RECTANGLE 4x10

Shape 2: SQUARE 50x50

Shape 3: CIRCLE 100

Shape 4: OVAL 100x40

Shape 5: OVAL 10x11

Shape 6: CIRCLE 10

Shape 7: SQUARE 1x1

Shape 8: RECTANGLE 1x2

Shape 9: RECTANGLE 2x2

Shape 10: CIRCLE 11

For this assignment you are to implement the classes: CShape, CCanvas, COval, CCircle, CRectangle and CSquare.
