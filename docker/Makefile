CONTAINER_PORT=5000
LOCAL_PORT=5000
REPO=getting_started
VERSION=$(shell git rev-parse HEAD)

build:
	docker build -t $(REPO):$(VERSION) ./
	# docker build ./ -t hello-world

debug: build
	docker run -it --rm --volume $(shell pwd):/app \
		-p $(LOCAL_PORT):$(CONTAINER_PORT) 
		$(REPO):latest bash

run: build
	# map localhost5000 to port 5000 inside container
	docker run -p $(LOCAL_PORT):$(CONTAINER_PORT) $(REPO):latest