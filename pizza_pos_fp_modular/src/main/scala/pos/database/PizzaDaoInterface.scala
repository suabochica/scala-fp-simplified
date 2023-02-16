package com.sua.pizza_pos_fp_modular
package pos.database

import com.sua.pizza_pos_fp_modular.Money
import pos.models.{CrustSize, CrustType, Topping}

/**
  * the interface for the functions (services) that a DAO
  * for our app should implement
  */
trait PizzaDaoInterface {

    def getToppingPrices(): Map[Topping, Money]
    def getCrustSizePrices(): Map[CrustSize, Money]
    def getCrustTypePrices(): Map[CrustType, Money]

}