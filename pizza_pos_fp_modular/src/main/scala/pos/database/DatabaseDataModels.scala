package com.sua.pizza_pos_fp_modular
package pos.database

import com.sua.pizza_pos_fp_modular.Money
import pos.models.{CrustSize, CrustType, Topping}

case class ToppingPrices(
                          name: Topping,
                          price: Money
                        )

case class CrustTypePrices(
                            crustType: CrustType,
                            price: Money
                          )

case class CrustSizePrices(
                            crustSize: CrustSize,
                            price: Money
                          )
