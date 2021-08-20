/*
 * This Groovy source file was generated by the Gradle 'init' task.
 */
package groovybox

import vps.performance_testing.appian.ResponseProcessor
import groovy.json.JsonOutput
import groovy.json.JsonSlurper

class App {
    static void main(String[] args) {
        String responsePath = System.getProperty('user.dir') + '/src/resources/response.json'
        String res = new File(responsePath).text

        def processor = new ResponseProcessor(res, null, null)        

		def documents = processor.getObjectsOfType('MultiColumnLayout')

		println(JsonOutput.toJson(documents))
    }
}
