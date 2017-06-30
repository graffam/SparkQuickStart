package com.spark
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
/**
  * How to have a basic spark app running in scala...
  */
object Application {
  def main(args: Array[String]): Unit = {
    /*
      This is the entry point for spark, most likely need to change these to the actual location of spark master. A
      config file could be used like type safe config.
     */
    val conf = new SparkConf().setAppName("SparkDemo").setMaster("local[*]")
    val sc = new SparkContext(conf)
    // Now we can do whatever we want with spark!

    /*
      Always remember to stop spark when done, otherwise an error will be thrown cause its mad.
     */
    sc.stop()
  }
}
