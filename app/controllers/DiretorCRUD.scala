package controllers

/**
 * Created by gilmar on 30/04/14.
 */

import play.api._
import play.api.mvc._
import models.Diretor

object DiretorCRUD extends Controller {

  def lista = Action {
    val diretores = Diretor.all()
    Ok(views.html.diretor.render(diretores))
  }

  def novoDiretor = TODO

  def detalhar(id: Long) = TODO

}
