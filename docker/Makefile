CONTAINER_PORT=5000
LOCAL_PORT=5000
NAME=getting_started
VERSION=$(shell git rev-parse HEAD)

build:
	docker build -t $(NAME):$(VERSION) ./
	# docker build ./ -t hello-world

# run terminal inside of container and mirror changes outside of container
# clean up after exit (ctrl+d)
# note that order of args matters
debug: build
	docker run -it --rm \
		--volume $(shell pwd):/app \
		-p $(LOCAL_PORT):$(CONTAINER_PORT) \
		$(NAME):$(VERSION) /bin/bash \

run: build
	# map localhost5000 to port 5000 inside container
	docker run -p $(LOCAL_PORT):$(CONTAINER_PORT) $(NAME):$(VERSION)