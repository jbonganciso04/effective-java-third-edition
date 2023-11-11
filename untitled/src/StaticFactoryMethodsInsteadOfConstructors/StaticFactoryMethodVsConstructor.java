package StaticFactoryMethodsInsteadOfConstructors;

public class StaticFactoryMethodVsConstructor {
/*
The traditional way for a class to allow a client to obtain an instance is to provide a public constructor. There is another
technique that should be a part of every programmer’s toolkit. A class can provide a public static factory method, which is simply a static method that returns an instance of the class. Here’s a simple example from Boolean (the boxed primitive class for boolean). This method translates a boolean primitive value into a Boolean object
reference:
*/
    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }

//    One advantage of static factory methods is that, unlike constructors, they have names.

//    A second advantage of static factory methods is that, unlike constructors, they are not required to create a new object each time they’re invoked.

//    A third advantage of static factory methods is that, unlike constructors, they can return an object of any subtype of their return type.

// Common Naming conventions from static factory methods.

//   1.from—A type-conversion method that takes a single parameter
//    and returns a corresponding instance of this type, for example:
//    Date d = Date.from(instant);

//    2. of—An aggregation method that takes multiple parameters andreturns an instance of this type that incorporates them, for
//    example:
//    Set<Rank> faceCards = EnumSet.of(JACK, QUEEN, KING);


//    3. valueOf—A more verbose alternative to from and of, for example:
//    BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE)

//   4. instance or getInstance—Returns an instance that is described by its parameters (if any) but cannot be said to have the same value, for example:
//    StackWalker luke = StackWalker.getInstance(options);


}
