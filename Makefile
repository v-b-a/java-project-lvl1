run-dist:
	./build/install/app/bin/app
install:
	./gradlew clean install
lint:
	./gradlew checkstyleMain checkstyleTest