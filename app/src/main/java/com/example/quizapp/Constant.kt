package com.example.quizapp

object Constants {

    fun getQuestion() :ArrayList<Question>{
        val questionsList=ArrayList<Question>()

        val q1=Question(1,
            "What country flag is this?",
            R.drawable.australia,
            "Australia",
            "Argentina",
            "Armenia", "USA",
            1)

        val q2 = Question(2,
            "What country flag is this", R.drawable.mexico,
            "Australia",
            "Argentina",
            "Mexico",
            "Palestine",
            3)
        val q3 = Question(3,
            "What country flag is this", R.drawable.palestine,
            "Mexico",
            "France",
            "Africa",
            "palestine",
            2)
        val q4 = Question(4,
            "What country flag is this", R.drawable.turkey,
            "Kazakistan",
            "Ukraine",
            "Turkey",
            "USA",
            3)
        val q5 = Question(5,
            "What country flag is this", R.drawable.uk,
            "USA",
            "Argentina",
            "Armenia",
            "South America",
            1)
        val q6 = Question(6,
            "What country flag is this", R.drawable.uk,
            "Australia",
            "Argentina",
            "UK",
            "USA",
            3)


        val q7 = Question(7,
            "What country flag is this", R.drawable.mexico,
            "Scotland",
            "European Union",
            "Armenia",
            "USA",
            2)


        val q8 = Question(8,
            "What country flag is this", R.drawable.germany,
            "Netherlands",
            "Spain",
            "Belgium",
            "Germany",
            4)


        val q9 = Question(9,
            "What country flag is this", R.drawable.canada,
            "Denmark",
            "Argentina",
            "Canada",
            "USA",
            3)


        val q10 = Question(10,
            "What country flag is this", R.drawable.india,
            "India",
            "Iran",
            "Ireland",
            "USA",
            1)

        questionsList.add(q1)
        questionsList.add(q2)
        questionsList.add(q3)
        questionsList.add(q4)
        questionsList.add(q5)
        questionsList.add(q6)
        questionsList.add(q7)
        questionsList.add(q8)
        questionsList.add(q9)
        questionsList.add(q10)


        return questionsList
    }
}