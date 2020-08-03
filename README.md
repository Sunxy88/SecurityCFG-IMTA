# Read me
Work progress and things to do for every week.

## 5th Week
DONE:
1. `subject.checkRole()` in try-catch structure, implemented [here in method `getTryStatements`](src/main/java/xisong/SecurityElementMatcher.java)
    * One problem : no example found
2. `subject.checkRole()` in a function who throws an exception if something goes wrong
    * Able to get all methods that contain a `subject.checkRole()`
    * Working on extraction of all statemetns after the call of `subject.checkRole()`

TODO:
1. Obtain all statments excuted after the calling of security verification functions :
    1. `subject.isPermitted()` in if structure
    3. `subject.checkRole()` in a function who throws an exception if something goes wrong
    4. `subject.isPermitted()` in if structure

## 4th Week
1. Obtain all statements corresponding to each role.
2. Add 3 new complete application as test cases.

## 3rd Week
1. Obtain the block where a specific function is called. Check [here](src/test/java/xisong/MatcherTest.java).
For example:![demo1](src/test/resources/shiro-example/3/DemoPicture.png)

## 2nd Week
1. Shiro examples from :s
    1. https://github.com/jjoe64/shiroexample
    2. little demo written by myself
2. [SecurityElementMatcher](src/main/java/xisong/SecurityElementMatcher.java) could find specified security element in given codes.
3. Result CFG could be stored in given directory in [GenerateCfg](src/main/java/xisong/GenerateCfg.java).

## 1st Week
1. Examples of different statements and corresponding control flow graphs 
are in the [folder here](src/test/resources/control-flow).
2. Example of the filter to search particular methods by given name is in
 [here](src/test/java/xisong/QueryParticularFunction.java).
3. For a Web application, a graph could be generated but **need to be refined**.
Because there are some strange begin blocks. 
