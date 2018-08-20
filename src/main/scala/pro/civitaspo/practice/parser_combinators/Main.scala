package pro.civitaspo.practice.parser_combinators

import scala.util.parsing.combinator._

object Main extends SimpleParser {

  def main(args: Array[String]) = println(parse(word, "johnny come lately"))

}

class SimpleParser extends RegexParsers {
  def word: Parser[String]    = """[a-z]+""".r ^^ { _.toString }
}
