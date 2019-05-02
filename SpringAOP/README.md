#Spring AOP

##@Component
Component is responsible for some operations in Spring.
1. `@Service`
2. `@Repository`
3. `@Controller`

##@Aspect
Modularization of a concern that cuts across multiple classes.
Unified logging is an example of cross-cutting concern

##Joinpoint
In Spring AOP, a `Joinpoint` is a a point during the execution of the program
that an aspect is executed. Like a logger.

##Pointcut
A pointcut is a __predicate__ that helps match the advice applied by a `aspect`
at a particular `Joinpoint`.

##Advice
Advice is an action taken by a `Aspect` at a particular `Joinpoint`. There are
different types of advice including: around, before and after.
