package lesson27

import static lesson27.DslBuilder.*

//def email = new Email()
//email.setFrom("from@mail.ru")
//email.setTo("to@mail.ru")
//email.setTitle("title")
//
//def body = new EmailBody()
//body.setText("text of the letter")
//email.setBody("title")
//body.setImages(List.of(image.jpg))

mail {
    from "from@mail.ru"
    to "to@mail.ru"
    title "title@mail.ru"
    body {
        text "text of the letter"
        images (['image.jpg','image2.png'])
    }
    title
}

