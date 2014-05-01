package controllers

/**
 * Created by gilmar on 30/04/14.
 */

import play.api._
import play.api.mvc._

object Inicio extends Controller {
  def index = Action {
    Ok(views.html.inicio.render())
  }
}
