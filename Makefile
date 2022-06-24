ifneq (,$(wildcard ./.env))
    include .env
    export
endif

# Self-Documented Makefile approach, borrowed from: https://marmelab.com/blog/2016/02/29/auto-documented-makefile.html

.DEFAULT_GOAL := help

help:
	@grep -E '^[a-zA-Z0-9_.-]+:.*?## .*$$' $(MAKEFILE_LIST) | awk 'BEGIN {FS = ":.*?## "}; {printf "\033[36m%-20s\033[0m %s\n", $$1, $$2}'

run: style  ## Run application
	npx shadow-cljs watch app

style:  ## Compile CSS
	npm run css

release:  ## Make a release app build
	npx shadow-cljs release app