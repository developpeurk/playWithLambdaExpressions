# Java Functional Interfaces and Lambda Expressions Summary

Java 8 introduced lambda expressions and functional interfaces, leveraging concise syntax and streamlining operations on collections. Here's an overview:

## Functional Interfaces

- **Interface**
    - Contains a single abstract method.
    - Can have default and static methods.
    - Optional annotation: `@FunctionalInterface`.

### Example Functional Interfaces

- **Comparator** `int compare(T t1, T t2)`
- **Consumer**  `void accept(T t)`
- **Predicate** ` boolean test(T t)`
- **Supplier**  `T get()`
- **BiConsumer** `void accept(T t, U u)`
- **BiPredicate** `void test(T t, U u)`
- **Function**  `R apply(T t)`
- **BiFunction** `R apply(T t, U u)`
- **UnaryOperator** 
````
public interface UnaryOperator<T> extends Function<T,T> {
	
}
````
- **BinaryOperator**
````
public interface BinaryOperator<T> extends BiFunction<T, T ,T>{

}
````

## Lambda Expressions

- Implementation of functional interfaces.
- Concise syntax for defining methods.

### Examples

- **Consumer**
  ```java
  Consumer<String> cons = s -> System.out.println(s);


### Predicate

```
  Predicate<String> p1 = s -> s != null;
  Predicate<String> p2 = s -> s.length() < 10;
  ```
 
### Function

```
  Function<String, Integer> length = s -> s.length();
 ```
### BiFunction

```
BiFunction<String, String, Integer> indexOf = (s1, s2) -> s1.indexOf(s2);
 ```


### Map Operations with Lambda Expressions

- **forEach**`BiConsumer`
- **replaceAll** `BiFunction`
- **compute** `(key, BiFunction)`
- **computeIfPresent** `(key, BiFunction)`
- **computeIfAbsent**`(key, Function)`
- **merge**`(key, value, BiFunction)`


- **Example using computeIfAbsent**

````
Map<Integer, List<String>> map = new HashMap<>();
map.computeIfAbsent(3, key -> new ArrayList<>()).add("one");

`````


- **Example using merge**

````
Map<Integer, String> map = new HashMap<>();
map.merge(4, "five", (oldValue, addValue) -> oldValue + "," + addValue);
````
