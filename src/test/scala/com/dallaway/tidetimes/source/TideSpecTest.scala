package com.dallaway.tidetimes.source

/*
  Copyright 2009-2014 Richard Dallaway

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

import org.specs2.mutable._
import org.joda.time.{LocalTime,DateTimeZone}

class TideSpecTest extends Specification {

  "Tide" should {
    "Be able to convert from GMT to BST" in {
      val m = new Metre(1)
      val gmt = new Tide( new LocalTime(12,34), m)
      val bst = new Tide( new LocalTime(13,34), m)
      
      gmt.forZone(DateTimeZone.forOffsetHours(1)) must be_==(bst)
      
    }
  }
}
