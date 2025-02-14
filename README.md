# Scala Generic Class and println Implicit Conversion Bug

This repository demonstrates a common issue in Scala related to implicit conversions and generic type parameters when using the `println` function. The bug occurs because `println`'s behavior is dependent on implicit conversion existence for the type T in `MyClass[T]`, which might not always be available for all types.

The `bug.scala` file showcases the problematic code, while `bugSolution.scala` provides a solution that handles the issue by using `toString` explicitly or providing custom implicit conversions.

## Bug Description

The `MyClass` utilizes a generic type parameter `T`.  The `printValue` method attempts to print the `value` using `println`, which only works implicitly for certain types.  Attempting to print a `List` directly results in a compilation or runtime error, highlighting the absence of an implicit conversion for `List` to a printable type.