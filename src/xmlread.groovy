/**
 * Created with IntelliJ IDEA.
 * User: Wayne
 * Date: 14-5-29
 * Time: 下午5:24
 * To change this template use File | Settings | File Templates.
 */
def customers = new XmlSlurper().parse(new File('customers.xml'))
for (customer in customers.corporate.customer) {
    println "${customer.@name} works for ${customer.@company}"
}
