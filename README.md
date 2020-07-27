# Read me
Work progress and things to do for every week.

## 4th Week
1. Obtain all statements corresponding to each role.
2. Add 3 new complete application as test cases.

## 3rd Week
1. Obtain the block where a specific function is called. Check [here](src/test/java/xisong/MatcherTest.java).
For example:![demo1](src/test/resources/shiro-example/3/DemoPicture.png)

**TODO**
1. Redundant statements occur. In `if else if` structure, `if` statements are repeatedly considered qualified while they are not.

## 2nd Week
1. Shiro examples from :
    1. https://github.com/jjoe64/shiroexample
    2. little demo written by myself
2. [SecurityElementMatcher](src/main/java/xisong/SecurityElementMatcher.java) could find specified security element in given codes.
3. Result CFG could be stored in given directory in [GenerateCfg](src/main/java/xisong/GenerateCfg.java).

**TODO**
1. Still need some time to search more applications using shiro.
2. Find a way to obtain methods called in code blocks.

## 1st Week
1. Examples of different statements and corresponding control flow graphs 
are in the [folder here](src/test/resources/control-flow).
2. Example of the filter to search particular methods by given name is in
 [here](src/test/java/xisong/QueryParticularFunction.java).
3. For a Web application, a graph could be generated but **need to be refined**.
Because there are some strange begin blocks. 

**TODO**
1. The offered maven dependency of [spoon](https://github.com/INRIA/spoon/tree/master/spoon-control-flow) does not work.
 Source code is directly used. **Possible to use package instead?** 
2. Filter is used instead of query to search methods, **Possible to use `CtQuery`?**
