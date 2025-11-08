package com.codewithmahad.oopquizapp.data

object CppQuizData : QuizDataSource {

    private val generalOopQuiz = listOf(
        Question(
            text = "What is the primary role of a destructor in C++?",
            options = listOf("Initialize object members", "Free up resources allocated by an object", "Create a copy of an object", "Define the class"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "Which C++ concept allows a class to have multiple methods with the same name but different parameters?",
            options = listOf("Function Overriding", "Function Overloading", "Inheritance", "Encapsulation"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "What does the 'this' pointer hold in C++?",
            options = listOf("Address of the base class", "Address of the current object", "Address of the next object in memory", "Address of the vtable"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "Which of these is NOT a fundamental concept of OOP?",
            options = listOf("Procedural Programming", "Inheritance", "Polymorphism", "Encapsulation"),
            correctAnswerIndex = 0
        ),
        Question(
            text = "In C++, a class where all members are public by default is a...",
            options = listOf("class", "template", "struct", "union"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "What is the result of using the 'new' operator in C++?",
            options = listOf("It creates a reference to an object", "It allocates memory on the stack", "It allocates memory on the heap and calls the constructor", "It calls the destructor"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "Which operator is used to access members of an object through a pointer?",
            options = listOf(". (dot)", ":: (scope resolution)", "* (dereference)", "-> (arrow)"),
            correctAnswerIndex = 3
        ),
        Question(
            text = "The ability of an object to take on many forms is known as...",
            options = listOf("Inheritance", "Polymorphism", "Encapsulation", "Abstraction"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "What is a 'friend' class in C++?",
            options = listOf("A class that can access the private and protected members of another class", "A base class", "A class that cannot be instantiated", "A class that inherits from another class"),
            correctAnswerIndex = 0
        ),
        Question(
            text = "Which keyword ensures that a member variable cannot be modified?",
            options = listOf("static", "virtual", "mutable", "const"),
            correctAnswerIndex = 3
        )
    )

    private val encapsulationQuiz = listOf(
        Question(
            text = "Which access specifier makes members accessible only within the class itself?",
            options = listOf("public", "protected", "private", "global"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "Bundling data and methods that work on the data into a single unit is called...",
            options = listOf("Abstraction", "Inheritance", "Polymorphism", "Encapsulation"),
            correctAnswerIndex = 3
        ),
        Question(
            text = "Which keyword in C++ can grant a non-member function access to the private members of a class?",
            options = listOf("friend", "public", "using", "extern"),
            correctAnswerIndex = 0
        ),
        Question(
            text = "The main advantage of encapsulation is...",
            options = listOf("Improving runtime performance", "Reducing code size", "Data hiding and protection", "Allowing global access to data"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "In a C++ class, members are by default...",
            options = listOf("public", "protected", "private", "global"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "What is the best way to allow client code to modify a private member variable?",
            options = listOf("Make the variable public", "Provide a public 'setter' method", "Make the client class a friend", "Use a global pointer"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "A 'const' member function...",
            options = listOf("Can modify any member variable", "Can only be called by const objects", "Cannot modify any member variables of the object", "Is automatically static"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "Hiding implementation details from the user is the core principle of...",
            options = listOf("Inheritance", "Polymorphism", "Encapsulation and Abstraction", "Recursion"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "In a C++ struct, members are by default...",
            options = listOf("public", "protected", "private", "static"),
            correctAnswerIndex = 0
        ),
        Question(
            text = "Which of the following is NOT a C++ access specifier?",
            options = listOf("public", "protected", "private", "package"),
            correctAnswerIndex = 3
        )
    )

    private val inheritanceQuiz = listOf(
        Question(
            text = "What type of inheritance occurs when a class inherits from a class that itself inherits from another?",
            options = listOf("Multiple", "Hierarchical", "Multilevel", "Single"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "Which keyword is used to specify inheritance in C++?",
            options = listOf(": (colon)", "extends", "inherits", "implements"),
            correctAnswerIndex = 0
        ),
        Question(
            text = "The 'diamond problem' is an ambiguity that can arise in...",
            options = listOf("Single inheritance", "Multiple inheritance", "Hierarchical inheritance", "Multilevel inheritance"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "How is the diamond problem typically solved in C++?",
            options = listOf("By using abstract classes", "By using virtual inheritance", "It cannot be solved", "By using private inheritance"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "What does 'protected' access specifier mean in inheritance?",
            options = listOf("Accessible only in the base class", "Accessible in the base class and its derived classes", "Accessible everywhere", "Not accessible at all"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "When a derived class object is created, which constructor is called first?",
            options = listOf("Derived class constructor", "Base class constructor", "The one with more arguments", "They are not called"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "What is an 'is-a' relationship representative of?",
            options = listOf("Composition", "Aggregation", "Inheritance", "Friendship"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "A class that is inherited from is called a...",
            options = listOf("Child class or Subclass", "Base class or Superclass", "Friend class", "Struct"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "Can a derived class access the private members of its base class?",
            options = listOf("Yes, directly", "No, not directly", "Only if it's a friend", "Yes, using the 'super' keyword"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "What is the default inheritance visibility mode in C++?",
            options = listOf("public", "protected", "private", "It must be specified"),
            correctAnswerIndex = 2
        )
    )

    private val polymorphismQuiz = listOf(
        Question(
            text = "Runtime polymorphism in C++ is achieved through...",
            options = listOf("Function Overloading", "Templates", "Virtual Functions", "Operator Overloading"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "Compile-time polymorphism in C++ is achieved through...",
            options = listOf("Virtual Functions", "Function Overloading and Operator Overloading", "Inheritance", "Abstract Classes"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "A function in a base class that is expected to be redefined by derived classes should be declared as...",
            options = listOf("static", "const", "friend", "virtual"),
            correctAnswerIndex = 3
        ),
        Question(
            text = "What is a vtable (virtual table)?",
            options = listOf("A table of variables", "A lookup table of virtual functions used to resolve calls at runtime", "A table for templates", "A table of static functions"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "What is function overriding?",
            options = listOf("Defining multiple functions with the same name but different parameters", "A derived class providing a specific implementation for a base class function", "Hiding a base class function", "Making a function private"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "A function that has no implementation in the base class and must be implemented by subclasses is a...",
            options = listOf("Friend function", "Static function", "Pure virtual function", "Const function"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "Which of the following operators cannot be overloaded in C++?",
            options = listOf("+", "==", "::", "[]"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "What is the result of binding function calls at compile time?",
            options = listOf("Dynamic binding", "Late binding", "Static binding", "No binding"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "To achieve dynamic polymorphism, you must access the object through a...",
            options = listOf("Base class reference or pointer", "Derived class object directly", "Friend function", "Static member"),
            correctAnswerIndex = 0
        ),
        Question(
            text = "What is the primary use of operator overloading?",
            options = listOf("To change the language syntax", "To make code more intuitive by allowing operators to work with user-defined types", "To improve performance", "To disable certain operators"),
            correctAnswerIndex = 1
        )
    )

    private val abstractionQuiz = listOf(
        Question(
            text = "Abstraction means...",
            options = listOf("Showing all the details", "Hiding the complexity and showing only essential features", "Using only private members", "Using global variables"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "A class containing at least one pure virtual function is called an...",
            options = listOf("Concrete class", "Abstract class", "Friend class", "Derived class"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "Can you create an instance of an abstract class in C++?",
            options = listOf("Yes", "No", "Only if it has a constructor", "Yes, by using 'new'"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "How is a pure virtual function declared in C++?",
            options = listOf("By appending '= 0' to its declaration", "Using the 'abstract' keyword", "Using the 'pure' keyword", "By defining it in the header file"),
            correctAnswerIndex = 0
        ),
        Question(
            text = "The main goal of abstraction is to manage...",
            options = listOf("Memory", "Performance", "Complexity", "Syntax"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "Which is a good example of abstraction in the real world?",
            options = listOf("A car engine's internal workings", "A TV remote control", "The source code of an operating system", "A detailed circuit diagram"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "An abstract class is useful when...",
            options = listOf("You want to create objects directly from it", "You want to provide a common base for a family of classes", "You want to prevent inheritance", "You want all methods to be public"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "If a class derives from an abstract class, what must it do?",
            options = listOf("Implement all pure virtual functions from the base class", "Declare all its own methods as virtual", "Become a friend class", "It does not need to do anything special"),
            correctAnswerIndex = 0
        ),
        Question(
            text = "Abstraction can be achieved through...",
            options = listOf("Access specifiers (public, private) and abstract classes", "Only through templates", "Only through inheritance", "Only by using structs"),
            correctAnswerIndex = 0
        ),
        Question(
            text = "What is the key difference between abstraction and encapsulation?",
            options = listOf("They are the same thing", "Abstraction hides complexity, Encapsulation hides data", "Abstraction is about inheritance, Encapsulation is about polymorphism", "Abstraction uses private, Encapsulation uses public"),
            correctAnswerIndex = 1
        )
    )

    override fun getGeneralOopQuiz(): List<Question> = generalOopQuiz
    override fun getEncapsulationQuiz(): List<Question> = encapsulationQuiz
    override fun getInheritanceQuiz(): List<Question> = inheritanceQuiz
    override fun getPolymorphismQuiz(): List<Question> = polymorphismQuiz
    override fun getAbstractionQuiz(): List<Question> = abstractionQuiz
}