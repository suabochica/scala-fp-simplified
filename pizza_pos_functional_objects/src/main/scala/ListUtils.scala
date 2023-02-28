package com.sua.pizza_pos_functional_objects

object ListUtils {
  def dropFirstMatch[A](ls: Seq[A], value: A): Seq[A] = {
    val index = ls.indexOf(value) // index is -1 there is no match

    if (index < 0) {
      ls
    } else if (index == 0) {
      ls.tail
    } else {
      // splitAt keeps matching element in the second group
      val (a, b) = ls.splitAt(index)

      a ++ b.tail
    }
  }
}
