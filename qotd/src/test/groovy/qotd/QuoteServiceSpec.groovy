package qotd

import grails.testing.mixin.integration.Integration
import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

@Integration(applicationClass = Application.class)
class QuoteServiceSpec extends Specification implements ServiceUnitTest<QuoteService>{

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }

    void "static quote service always returns quiche quote"() {
        when:
        Quote staticQuote = service.getStaticQuote()
        then:
        staticQuote.author == "Anonymous"
        staticQuote.content == "Real Programmers Don't eat much quicheQuiche"
    }
}
