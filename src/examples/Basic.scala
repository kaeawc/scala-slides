package examples

import java.util._
import com.aspose.slides.Presentation
import java.io._
import scala.reflect._

object Basic {

  def execute = {
    var pres = new Presentation("/Users/jason/git/kaeawc/scala-slides/resources/pptx/demo.pptx")
    val slides = pres.getSlides()

    val total = slides.getCount()

    for(i <- 0 until total) {
      val slide = slides.get_Item(i)
      println(slide.getName())
      println(slide)
    }

    0
  }

}

