package examples

import java.util._
import com.aspose.slides._
import java.io._
import java.awt.image.BufferedImage
import scala.reflect._
import javax.imageio.ImageIO

object AsPdf {

  def execute = {
    var pres = new PresentationEx("/Users/jason/git/kaeawc/scala-slides/resources/ppt/demo.ppt")

    val slides = pres.getSlides()

    val total = slides.getCount()

    for(i <- 0 until total) {
      val slide = slides.get_Item(i)
      slide.writeAsSvg(new java.io.FileOutputStream("output/slides/simple_" + i + ".svg"), SVGOptions.getSimple)
    }

    0
  }

}

