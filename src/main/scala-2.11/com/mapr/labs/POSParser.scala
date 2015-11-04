package com.mapr.labs

import java.io.InputStream

/**
  * Created by mlalapet on 11/4/15.
  */
object POSParser {

  def main(args:Array[String]): Unit = {
    val stream : InputStream = getClass.getResourceAsStream("/possample.xml")
    val source = scala.io.Source.fromInputStream(stream)
    val xml = source.getLines.mkString

    val pos = POSXMLParser.parseXML(xml)

    println(pos.getTransaction.get(0).getWorkstationID.getValue)
  }

}
