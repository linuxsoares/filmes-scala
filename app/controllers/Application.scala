package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def sobre = Action {
    Ok(views.html.sobre.render("Top 100 filmes Cult", play.core.PlayVersion.current))
  }

}