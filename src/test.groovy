/**
 * Created with IntelliJ IDEA.
 * User: Wayne
 * Date: 14-5-29
 * Time: 下午4:44
 * To change this template use File | Settings | File Templates.
 */
def number = 0
new File('test.groovy').eachLine { line ->
    number++
    println "$number: $line"
}