import service.SlackServiceImpl

import scala.concurrent.Await
import scala.concurrent.duration.Duration

/**
  * run RunMain to send the message "welcome user on slack!! :)" on slack channel named notify-me as user
  */
object RunMain extends App {

  val slackServiceImpl = SlackServiceImpl
  val result = Await.result(slackServiceImpl.sendSlackMsg("general", "@channel Testing on slack!! :)", Some("Anmol")), Duration(20, "seconds"))

}
