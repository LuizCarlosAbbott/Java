package qotd

import grails.transaction.Transactional

@Transactional
class QuoteService {

    def getStaticQuote() {
        return new Quote(author: "Anonymous",
                content: "Real Programmers Don't eat much quicheQuiche")
    }

    def getRandomQuote() {

        new Quote(author: 'Larry Wall', content: 'There is more than one method to our madness.').save()
        new Quote(author: 'Chuck Norris Facts', content: 'Chuck Norris always uses his own design patterns, and his favorite is the Roundhouse Kick.').save()
        new Quote(author: 'Eric Raymond', content: 'Being a social outcast helps you stay concentrated on the really important things, like thinking and hacking.').save()

        def allQuotes = Quote.list()
        def randomQuote = null
        if (allQuotes.size() > 0) {
            def randomIdx = new Random().nextInt(allQuotes.size())
            randomQuote = allQuotes[randomIdx]
        } else {
            randomQuote = getStaticQuote()
        }
        return randomQuote
    }
}