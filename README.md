# Artifact Verifier: Sample Custom Notifier

This project is an example of how to add a new Notifier implementation to the 
[Artifact Verifier](https://github.com/jidemoto/artifact-verifier-api).

This repo is part of a project for Georgia Tech's Cybersecurity Practicum and ongoing support
isn't guaranteed.  See the [Artifact Verifier Repo](https://github.com/jidemoto/artifact-verifier) for more information.

## How To

1. Make sure the verifier API dependency is installed locally (see [the API project](https://github.com/jidemoto/artifact-verifier-api))
2. Create all of the spring beans that you need (including the Notifier implementation) under the package `to.idemo.james.artifactverifier`
3. `./gradlew jar` to build the jar file
4. `docker build . $TAG` to build the image

Then you should be able to run the image at `$TAG` with the custom code added to the image.