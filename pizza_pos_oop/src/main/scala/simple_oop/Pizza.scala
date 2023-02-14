package com.sua.pizza_pos_oop
package simple_oop

import common.{CrustSize, CrustType, MediumCrustSize, RegularCrustType, Topping}

import scala.collection.mutable.ArrayBuffer

class Pizza {
  var curstSize: CrustSize = MediumCrustSize
  var curstType: CrustType = RegularCrustType

  // no need for 'toppings' to be a 'var'; 'ArrayBuffer' is mutable
  val toppings = ArrayBuffer[Topping]()

  def addTopping(t: Topping): Unit = { toppings += t }
  def removeTopping(t: Topping): Unit = { toppings -= t }
  def removeAllTopping(): Unit = { toppings.clear }

  def getPrice(
              toppingPrices: Map[Topping, Money],
              curstSizePrices: Map[CrustSize, Money],
              curstTypePrices: Map[CrustType, Money],
              ): Money = ???
}