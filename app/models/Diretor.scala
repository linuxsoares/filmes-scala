package models

/**
 * Created by gilmar on 30/04/14.
 */

import anorm.Pk

import scala.util.Random

case class Diretor(
  id: Long, nome: String
)

object Diretor {
  def all(): List[Diretor] = Nil

  def create(label: String) {}

  def delete(id: Long) {}
}

