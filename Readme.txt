************************Tutorial 11******************************
Understanding Bean scopes -> By default bean scope is set to SINGLETON i.e only one object is created when applicationContext instantiated and passes to every other object.
Secondly we can set bean scope as PROTOTYPE . New object will create every time when getBean would be called.
Web-aware Bean scopes are REQUEST, SESSION, GLOBALSESSION.
REQUEST -> new object is created for every request but when we get the object within the request it will give the same object.
SESSION -> new object is created for every session.
GLOBALSESSION -> same object is for the whole http application.
