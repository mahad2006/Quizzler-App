package com.codewithmahad.oopquizapp.data

object PythonQuizData : QuizDataSource {

    private val generalOopQuiz = listOf(
        Question(
            text = "What is the method that acts as a constructor in Python?",
            options = listOf("__construct__", "__new__", "__init__", "__main__"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "The first parameter of any instance method in a Python class is conventionally named...",
            options = listOf("this", "self", "me", "instance"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "Which of the following is used to define a block of code in Python?",
            options = listOf("Curly braces {}", "Parentheses ()", "Indentation", "Brackets []"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "What does the term 'MRO' stand for in Python inheritance?",
            options = listOf("Method Runtime Order", "Method Resolution Order", "Most Referenced Object", "Multiple Resolution Object"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "How do you create an instance of a class named 'Car' in Python?",
            options = listOf("new Car()", "Car.new()", "Car()", "instance(Car)"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "Which of the following is NOT a core OOP principle?",
            options = listOf("Inheritance", "Polymorphism", "Iteration", "Encapsulation"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "In Python, everything is an...",
            options = listOf("Object", "Class", "Function", "Variable"),
            correctAnswerIndex = 0
        ),
        Question(
            text = "What is 'duck typing'?",
            options = listOf("A way to enforce strict type checking", "A concept where the type of an object is determined by its behavior (methods and properties)", "A special type of class in Python", "A way to name variables"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "Which magic method is called when an object is about to be destroyed?",
            options = listOf("__init__", "__destroy__", "__finish__", "__del__"),
            correctAnswerIndex = 3
        ),
        Question(
            text = "How do you access the methods of a parent class from a subclass in Python?",
            options = listOf("parent.method()", "super().method()", "base.method()", "self.parent.method()"),
            correctAnswerIndex = 1
        )
    )

    private val encapsulationQuiz = listOf(
        Question(
            text = "How do you suggest a variable should be treated as non-public (private) in Python?",
            options = listOf("Prefix with 'private' keyword", "Prefix with two underscores (__)", "Prefix with one underscore (_)", "Suffix with an underscore (_)"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "What is the purpose of name mangling in Python (e.g., __my_var)?",
            options = listOf("To make the variable truly private and inaccessible", "To avoid naming conflicts in subclasses", "To make the variable a class variable", "To make the variable a constant"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "What is the primary way to provide controlled access to class attributes?",
            options = listOf("Making attributes public", "Using global variables", "Using properties (getters and setters)", "Using dictionaries"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "The concept of bundling data and methods together is known as...",
            options = listOf("Abstraction", "Inheritance", "Polymorphism", "Encapsulation"),
            correctAnswerIndex = 3
        ),
        Question(
            text = "Which of these is a benefit of encapsulation?",
            options = listOf("It allows for direct modification of data", "It simplifies the code by making everything public", "It protects data from uncontrolled access and modification", "It makes debugging harder"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "How do you define a property that only has a getter in Python?",
            options = listOf("Define a method with the @property decorator", "Define a method with the @setter decorator", "Use the 'readonly' keyword", "It's not possible"),
            correctAnswerIndex = 0
        ),
        Question(
            text = "A variable prefixed with a single underscore is, by convention, intended for...",
            options = listOf("Public use", "Internal use", "Constants", "Class methods"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "Is data truly private in Python?",
            options = listOf("Yes, it is impossible to access it from outside the class", "No, privacy is enforced by convention rather than by the language itself", "Only if you use name mangling", "Yes, if you use the 'private' keyword"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "What is the main purpose of the @property decorator?",
            options = listOf("To turn a method into a read-only attribute", "To create a class variable", "To delete a method", "To make a method static"),
            correctAnswerIndex = 0
        ),
        Question(
            text = "Encapsulation helps in making your code...",
            options = listOf("More coupled", "More modular and easier to maintain", "Faster", "More difficult to test"),
            correctAnswerIndex = 1
        )
    )

    private val inheritanceQuiz = listOf(
        Question(
            text = "How do you indicate that a class 'Dog' inherits from a class 'Animal' in Python?",
            options = listOf("class Dog inherits Animal:", "class Dog extends Animal:", "class Dog(Animal):", "class Dog :: Animal:"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "Does Python support multiple inheritance?",
            options = listOf("No, it only supports single inheritance", "Yes, a class can inherit from multiple classes", "Only through interfaces", "Only for abstract classes"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "What is the Method Resolution Order (MRO)?",
            options = listOf("The order in which methods were defined in the file", "The sequence of classes to search for a method", "The way Python optimizes method calls", "The order of constructors being called"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "What is the role of the `super()` function in Python?",
            options = listOf("To call the constructor of the current class", "To refer to the base class or superclass", "To create a new instance of a class", "To access global variables"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "If a method exists in both the subclass and the superclass, which one is called by default from a subclass instance?",
            options = listOf("The superclass's method", "The subclass's method (it overrides the superclass method)", "It results in an error", "Python chooses one randomly"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "What type of relationship does inheritance model?",
            options = listOf("A 'has-a' relationship", "An 'is-a' relationship", "A 'uses-a' relationship", "A 'contains-a' relationship"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "The base class from which all other classes in Python inherit is...",
            options = listOf("__main__", "object", "base", "root"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "What is multilevel inheritance?",
            options = listOf("A class inherits from multiple classes", "A class is derived from a class which is also derived from another class", "Multiple classes inherit from one base class", "A class inherits from itself"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "Can you prevent a method from being overridden in Python?",
            options = listOf("Yes, using the 'final' keyword", "Yes, by making it private (using double underscores)", "No, there is no explicit way to do this", "Yes, by using the 'static' keyword"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "What is hierarchical inheritance?",
            options = listOf("When one class inherits from another in a chain", "When more than one subclass is inherited from a single base class", "When a class inherits from multiple base classes", "When a class inherits from its own type"),
            correctAnswerIndex = 1
        )
    )

    private val polymorphismQuiz = listOf(
        Question(
            text = "Polymorphism in Python is most closely associated with what concept?",
            options = listOf("Strict type checking", "Duck Typing", "Static methods", "Private members"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "What does it mean for an object to be polymorphic?",
            options = listOf("It can be serialized", "It can take on many forms or be used in different ways", "It cannot be inherited", "It has no methods"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "Method overriding is an example of...",
            options = listOf("Compile-.time polymorphism", "Static polymorphism", "Runtime polymorphism", "Ad-hoc polymorphism"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "If you have a list of objects of different classes, but all have a `.fly()` method, you can call this method on each. This is an example of...",
            options = listOf("Encapsulation", "Inheritance", "Polymorphism", "Abstraction"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "Is method overloading (same method name, different parameters) a standard feature in Python?",
            options = listOf("Yes, it works just like in Java/C++", "No, Python does not support method overloading in the traditional sense", "Only for built-in functions", "Yes, but only with the `@overload` decorator"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "How does Python handle a method call on an object?",
            options = listOf("It checks the object's type first", "It just tries to call the method, regardless of the object's type", "It requires casting to the correct type", "It only works if all objects are from the same class"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "The ability of built-in functions like `len()` to work on different types (strings, lists, dictionaries) is an example of...",
            options = listOf("Polymorphism", "Inheritance", "A syntax error", "Encapsulation"),
            correctAnswerIndex = 0
        ),
        Question(
            text = "How can you achieve behavior similar to method overloading in Python?",
            options = listOf("It's impossible", "By using default arguments or variable-length argument lists (*args, **kwargs)", "By creating multiple classes", "By using the 'overload' keyword"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "What is the main benefit of polymorphism?",
            options = listOf("It makes code run faster", "It allows you to write more flexible and reusable code", "It enforces strict typing", "It reduces the need for classes"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "'An object is an instance of a class, but it can be treated as an instance of its superclass.' This statement describes...",
            options = listOf("Encapsulation", "Polymorphism through inheritance", "Data hiding", "A design flaw"),
            correctAnswerIndex = 1
        )
    )

    private val abstractionQuiz = listOf(
        Question(
            text = "How do you define an abstract base class (ABC) in Python?",
            options = listOf("By inheriting from the `ABC` class in the `abc` module", "By using the `abstract` keyword", "All classes in Python are abstract by default", "By creating a class with no methods"),
            correctAnswerIndex = 0
        ),
        Question(
            text = "What is the purpose of the `@abstractmethod` decorator?",
            options = listOf("To create a concrete method", "To indicate a method that must be implemented by subclasses", "To make a method private", "To make a method static"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "Can you create an instance of an abstract base class?",
            options = listOf("Yes, always", "No, it will raise a TypeError", "Only if it has an __init__ method", "Yes, but it will be empty"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "What is the primary goal of abstraction?",
            options = listOf("To expose all implementation details", "To hide complexity and expose only the essential features", "To make code more verbose", "To prevent inheritance"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "If a class inherits from an ABC but does not implement all of its abstract methods, what happens?",
            options = listOf("The program runs without issues", "The subclass also becomes an abstract class", "It raises a SyntaxError", "The methods are inherited automatically"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "A real-world example of abstraction is...",
            options = listOf("The complete circuit diagram of a TV", "A TV remote control", "The manufacturing process of a CPU", "The binary code of an application"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "Abstraction helps to...",
            options = listOf("Increase the coupling between parts of your code", "Make your code harder to understand", "Separate what something does from how it does it", "Eliminate the need for functions"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "In Python, are interfaces and abstract classes the same thing?",
            options = listOf("Yes, they are identical", "Python has interfaces but not abstract classes", "Python uses abstract base classes to achieve what interfaces do in other languages", "Python has neither"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "A class with abstract methods...",
            options = listOf("Is designed to be instantiated directly", "Serves as a blueprint for other classes", "Cannot be inherited from", "Must not have an __init__ method"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "Which module provides the tools for creating abstract base classes in Python?",
            options = listOf("__future__", "sys", "abc", "types"),
            correctAnswerIndex = 2
        )
    )

    override fun getGeneralOopQuiz(): List<Question> = generalOopQuiz
    override fun getEncapsulationQuiz(): List<Question> = encapsulationQuiz
    override fun getInheritanceQuiz(): List<Question> = inheritanceQuiz
    override fun getPolymorphismQuiz(): List<Question> = polymorphismQuiz
    override fun getAbstractionQuiz(): List<Question> = abstractionQuiz
}