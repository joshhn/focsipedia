---
id: scala
title: Scala
---

# Scala

This is just a placeholder for trying out using Scala plus mdoc with FoCSipedia.

```scala mdoc
val a = 6
val b = a + 1
println(a * b)
```

Here's another:
```scala mdoc
sealed trait Tree
case object Leaf extends Tree
case class Node(left: Tree, value: Int, right: Tree) extends Tree

val t = Node(Node(Leaf, 1, Leaf), 2, Leaf)
```