package config

import spark.Spark.{before, port}

object Config {
  System.err.close()

  def setupConfig(): Unit = {
    port(5000)
    before((_, res) => res.`type`("text/html"))
  }
}
