/**
 * Created with IntelliJ IDEA.
 * User: Wayne
 * Date: 14-5-29
 * Time: 下午5:09
 * To change this template use File | Settings | File Templates.
 */
def classes = [String, List, File]
for (clazz in classes) {
    println clazz.'package'.name
}
