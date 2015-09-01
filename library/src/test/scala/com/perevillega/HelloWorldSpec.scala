package com.perevillega

import org.scalatest.{Matchers, FlatSpec}
import org.scalatest.mock.MockitoSugar

class HelloWorldSpec extends FlatSpec with MockitoSugar with Matchers {

  "Hello World Spec" should "never fail" in {
    true should be(right = true)
  }

}
