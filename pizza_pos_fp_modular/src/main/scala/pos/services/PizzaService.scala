package com.sua.pizza_pos_fp_modular
package pos.services

import com.sua.pizza_pos_fp_modular.Money
import pos.models.{CrustSize, CrustType, Pizza, Topping}
import utils.ListUtils

trait PizzaService {
  def addTopping(p: Pizza, t: Topping): Pizza = {
    val newToppings = p.toppings :+ t

    p.copy(toppings = newToppings)
  }

  def removeTopping(p: Pizza, t: Topping): Pizza = {
    val newToppings = ListUtils.dropFirstMatch(p.toppings, t)

    p.copy(toppings = newToppings)
  }

  def removeAllTopping(p: Pizza): Pizza = {
    val newToppings = Seq[Topping]()

    p.copy(toppings = newToppings)
  }

  def updateCrustSize(p: Pizza, cs: CrustSize): Pizza = {
    p.copy(crustSize = cs)
  }

  def updateCrustType(p: Pizza, ct: CrustType): Pizza = {
    p.copy(crustType = ct)
  }

  def calculatePizzaPrice(
                         p: Pizza,
                         toppingPrices: Map[Topping, Money],
                         crustSizePrices: Map[CrustSize, Money],
                         crustTypePrices: Map[CrustType, Money],
                         ): Money = {
    val base = BigDecimal(10)
    val numToppings = p.toppings.size
    val price = base + 1.00 * numToppings

    price
  }
}