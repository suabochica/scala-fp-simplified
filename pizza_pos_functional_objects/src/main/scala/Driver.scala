package com.sua.pizza_pos_functional_objects

object Driver extends App {
  // initialize the data from the database
  val toppingPrices = MockPizzaDao.getToppingPrices()
  val crustSizePrices = MockPizzaDao.getCrustSizePrices()
  val crustTypePrices = MockPizzaDao.getCrustTypePrices()

  // create a pizza
  val pizza1 = Pizza(
    MediumCrustSize,
    ThinCrustType,
    Seq(Cheese, Pepperoni)
  )

  // make sure you can create modified version of the initial pizza
  val pizza2 = pizza1.addTopping(Olives)
  val pizza3 = pizza2.updateCrustSize(LargeCrustSize)

  println(s"Pizza 3 composition:: $pizza3")

  // get pizza 3 price
  val pizza3Price = pizza3.getPrice(
    toppingPrices,
    crustSizePrices,
    crustTypePrices
  )

  println(s"Pizza 3 price:: $pizza3Price")

  // test  update method
  val pizza4 = pizza1.addTopping(Sausage)
    .updateCrustSize(SmallCrustSize)
    .updateCrustType(ThickCrustType)

  println(s"Pizza 4 composition:: $pizza4")
}