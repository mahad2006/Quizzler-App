package com.codewithmahad.oopquizapp.data

object JavaQuizData : QuizDataSource {

    private val generalOopQuiz = listOf(
        Question(
            text = "Which concept is used to hide the internal implementation of an object?",
            options = listOf("Inheritance", "Polymorphism", "Encapsulation", "Abstraction"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "What is the primary purpose of a constructor in Java/Kotlin?",
            options = listOf("To destroy an object", "To initialize a newly created object", "To run the main logic", "To define a class blueprint"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "In Kotlin, what is the term for a class that can be inherited from?",
            options = listOf("final class", "static class", "sealed class", "open class"),
            correctAnswerIndex = 3
        ),
        Question(
            text = "Which of these is NOT a pillar of Object-Oriented Programming?",
            options = listOf("Concurrency", "Inheritance", "Encapsulation", "Polymorphism"),
            correctAnswerIndex = 0
        ),
        Question(
            text = "A 'has-a' relationship between classes is represented by...",
            options = listOf("Inheritance", "Composition/Aggregation", "Polymorphism", "An interface"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "What is the default access level for members in a Kotlin class?",
            options = listOf("private", "protected", "internal", "public"),
            correctAnswerIndex = 3
        ),
        Question(
            text = "Which keyword is used to call a method from a parent class in Java/Kotlin?",
            options = listOf("this", "parent", "super", "base"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "What is a primary advantage of using interfaces?",
            options = listOf("They allow code reuse through inheritance", "They allow a class to inherit from multiple interfaces", "They provide concrete method implementations", "They can be instantiated directly"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "In Kotlin, what type of class restricts the class hierarchy to a specific set of subclasses?",
            options = listOf("data class", "enum class", "sealed class", "inner class"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "Which concept allows an object to be treated as an instance of its parent class?",
            options = listOf("Encapsulation", "Polymorphism", "Abstraction", "Composition"),
            correctAnswerIndex = 1
        )
    )

    private val encapsulationQuiz = listOf(
        Question(
            text = "Which access modifier provides the most restrictive access?",
            options = listOf("public", "protected", "private", "internal"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "What are 'getters' and 'setters' (or properties in Kotlin) used for?",
            options = listOf("To provide controlled access to private fields", "To delete objects", "To create objects", "To make fields public"),
            correctAnswerIndex = 0
        ),
        Question(
            text = "Encapsulation is also known as...",
            options = listOf("Data Hiding", "Polymorphism", "Inheritance", "Data Abstraction"),
            correctAnswerIndex = 0
        ),
        Question(
            text = "In Kotlin, how do you define a read-only property?",
            options = listOf("Using 'var'", "Using 'const'", "Using 'val'", "Using 'let'"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "Which statement best describes the benefit of encapsulation?",
            options = listOf("It makes code faster", "It allows you to protect your data from accidental modification", "It allows multiple inheritance", "It is required for all classes"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "If a class member in Java has no access modifier, what is its access level?",
            options = listOf("public", "private", "protected", "package-private (default)"),
            correctAnswerIndex = 3
        ),
        Question(
            text = "Why is it a good practice to make class fields private?",
            options = listOf("To make them accessible everywhere", "To prevent subclasses from accessing them", "To control how the data is accessed and modified", "To save memory"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "In Kotlin, a property declared with 'val' is...",
            options = listOf("Mutable and has a setter", "Immutable and has no setter by default", "Mutable and has no getter", "Visible only within the class"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "What is the relationship between encapsulation and data hiding?",
            options = listOf("They are unrelated concepts", "Data hiding is a result of encapsulation", "Encapsulation is a result of data hiding", "They are the same thing"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "A class with only private fields and public methods to access them demonstrates...",
            options = listOf("Poor design", "Inheritance", "Polymorphism", "Good encapsulation"),
            correctAnswerIndex = 3
        )
    )

    private val inheritanceQuiz = listOf(
        Question(
            text = "An 'is-a' relationship between objects is best implemented using...",
            options = listOf("Inheritance", "Composition", "Interfaces", "Encapsulation"),
            correctAnswerIndex = 0
        ),
        Question(
            text = "In Java, which keyword is used by a subclass to inherit from a superclass?",
            options = listOf("implements", "inherits", "extends", "super"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "What is the top-most class in the Java class hierarchy?",
            options = listOf("Main", "System", "Object", "Class"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "Can a 'final' class in Java be extended?",
            options = listOf("Yes", "No", "Yes, but only once", "Only by abstract classes"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "In Kotlin, all classes are by default...",
            options = listOf("open (inheritable)", "abstract", "sealed", "final (non-inheritable)"),
            correctAnswerIndex = 3
        ),
        Question(
            text = "What is multiple inheritance?",
            options = listOf("A class inheriting from multiple classes", "A class inheriting from a single class", "Multiple classes inheriting from one class", "A class inheriting in a chain"),
            correctAnswerIndex = 0
        ),
        Question(
            text = "Does Java support multiple inheritance of classes?",
            options = listOf("Yes, directly", "No, but it can be achieved with interfaces", "Only for abstract classes", "Yes, using the 'multi' keyword"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "What is hierarchical inheritance?",
            options = listOf("One class inherits from another, which inherits from another", "Multiple classes inherit from a single base class", "A class inherits from multiple base classes", "A class inherits from itself"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "Which constructor is called first when creating a subclass object?",
            options = listOf("The subclass constructor", "The superclass constructor", "They are called in random order", "No constructor is called"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "In Kotlin, how do you call a superclass constructor from a subclass?",
            options = listOf("Using super() in the method body", "By adding : super() after the subclass constructor signature", "It's called automatically and cannot be specified", "Using parent()"),
            correctAnswerIndex = 1
        )
    )

    private val polymorphismQuiz = listOf(
        Question(
            text = "Polymorphism allows you to...",
            options = listOf("Hide data", "Define methods that have the same name but different behaviors", "Create objects", "Inherit from multiple classes"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "Which of the following is an example of compile-time polymorphism (static binding)?",
            options = listOf("Method Overriding", "Method Overloading", "Virtual Functions", "Abstract Classes"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "Which of the following is an example of runtime polymorphism (dynamic binding)?",
            options = listOf("Method Overriding", "Method Overloading", "Final methods", "Static methods"),
            correctAnswerIndex = 0
        ),
        Question(
            text = "To achieve runtime polymorphism in Java, a method in the parent class must be...",
            options = listOf("final", "static", "private", "non-final and non-static"),
            correctAnswerIndex = 3
        ),
        Question(
            text = "What is the term for a reference variable of a parent class referring to an object of a child class?",
            options = listOf("Downcasting", "Upcasting", "Type casting", "Illegal operation"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "Function overloading is determined by...",
            options = listOf("The function name only", "The function name and return type", "The function name and its parameter signature", "The function's access modifier"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "In Kotlin, which keyword is used to override a method from a superclass?",
            options = listOf("virtual", "override", "overwrite", "redef"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "Can you override a private method in Java/Kotlin?",
            options = listOf("Yes", "No, because it is not visible to the subclass", "Only if the subclass is in the same package", "Yes, if you use the 'override' keyword"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "Dynamic method dispatch is the mechanism that enables...",
            options = listOf("Compile-time polymorphism", "Method overloading", "Static binding", "Runtime polymorphism"),
            correctAnswerIndex = 3
        ),
        Question(
            text = "Is it possible to overload a function based on the return type alone?",
            options = listOf("Yes, in both Java and Kotlin", "Only in Kotlin", "No, this is not allowed in Java or Kotlin", "Only in Java"),
            correctAnswerIndex = 2
        )
    )

    private val abstractionQuiz = listOf(
        Question(
            text = "Abstraction focuses on showing essential features and hiding...",
            options = listOf("Public methods", "Interfaces", "Complexity and implementation details", "Data members"),
            correctAnswerIndex = 2
        ),
        Question(
            text = "An abstract class in Java/Kotlin...",
            options = listOf("Can be instantiated", "Cannot be instantiated", "Can only have abstract methods", "Cannot have a constructor"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "What is a key difference between an abstract class and an interface in Java 8+?",
            options = listOf("Interfaces can't have any implemented methods", "Abstract classes can hold state (fields), interfaces generally cannot", "A class can only implement one interface", "Abstract classes cannot have constructors"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "If a class contains at least one abstract method, the class must be declared as...",
            options = listOf("public", "static", "final", "abstract"),
            correctAnswerIndex = 3
        ),
        Question(
            text = "Can an abstract method be declared as 'final'?",
            options = listOf("Yes", "No, this is a contradiction", "Only in Kotlin", "Only if it is also static"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "What is the main purpose of an interface?",
            options = listOf("To provide a complete implementation", "To enforce a contract of capabilities on a class", "To be instantiated to create objects", "To store instance variables"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "A class can implement...",
            options = listOf("Only one interface", "Multiple interfaces", "Only one abstract class", "Multiple abstract classes"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "Do you need to provide implementations for all methods of an interface?",
            options = listOf("No, never", "Yes, unless the class is abstract", "Only for default methods", "Yes, always"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "In Kotlin, interfaces can contain...",
            options = listOf("Only abstract method declarations", "Abstract methods and methods with default implementations", "Instance fields (state)", "Constructors"),
            correctAnswerIndex = 1
        ),
        Question(
            text = "Abstraction helps in...",
            options = listOf("Making the code run faster", "Reducing code complexity and improving maintainability", "Increasing the size of the codebase", "Coupling the code tightly"),
            correctAnswerIndex = 1
        )
    )

    override fun getGeneralOopQuiz(): List<Question> = generalOopQuiz
    override fun getEncapsulationQuiz(): List<Question> = encapsulationQuiz
    override fun getInheritanceQuiz(): List<Question> = inheritanceQuiz
    override fun getPolymorphismQuiz(): List<Question> = polymorphismQuiz
    override fun getAbstractionQuiz(): List<Question> = abstractionQuiz
}