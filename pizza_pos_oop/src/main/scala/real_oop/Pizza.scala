package com.sua.pizza_pos_oop
package real_oop

import common._
import scala.collection.mutable.ArrayBuffer

class Pizza {
  type Money = BigDecimal

  // private fields
  private var _crustSize: CrustSize = MediumCrustSize
  private var _crustType: CrustType = RegularCrustType
  private val _toppings = ArrayBuffer[Topping]()

  def getCrustSize = _crustSize
  def setCrustSize(cs: CrustSize): Unit = {
    _crustSize = cs
  }

  def getCrustType = _crustType
  def setCrustType(ct: CrustType) {
    _crustType = ct
  }

  def addTopping(t: Topping) {
    _toppings += t
  }

  def removeTopping(t: Topping) {
    _toppings -= t
  }

  def removeAllToppings(): Unit = {
    _toppings.clear
  }

  def getPrice(): Money = ???
}