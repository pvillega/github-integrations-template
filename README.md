# Github Integrations Template

Sample project showing how to integrate the most common Github Shields you see in Github projects.
Although it's not a big effort to do this, having a central place with examples makes it easier to replicate and test.

## Badges

You can log to all these apps with your Github account, no need for new user accounts.

### Gitter

[![Gitter](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/pvillega/github-integrations-template?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

* **URL:** https://gitter.im/
* **What:** Adds a chat channel for your project, accessible with Github accounts, so your userbase can communicate and discuss the project
* **Notes:** if you create a channel from a repository, Gitter will create a pull request to add the badge to your Readme.md

### Travis CI

[![Build Status](https://travis-ci.org/pvillega/github-integrations-template.svg)](https://travis-ci.org/pvillega/github-integrations-template)

* **URL:** https://travis-ci.org/
* **What:** CI engine to use with open source projects
* **Notes:** Clicking on the badge that is displayed in the project page in Travis CI shows the image url

### Codacy

[![Codacy Badge](https://api.codacy.com/project/badge/05b65e469d1041c29e77d558a53aef5a)](https://www.codacy.com/app/pere-villega/github-integrations-template)

* **URL:** https://www.codacy.com/
* **What:** Automated code review of projects
* **Notes:** Project settings provides the code for the badge

### Waffle

[![Stories in Ready](https://badge.waffle.io/pvillega/github-integrations-template.svg?label=ready&title=Ready)](http://waffle.io/pvillega/github-integrations-template)

* **URL:** https://waffle.io/
* **What:** Management of github issues
* **Notes:** Project Settings > General provides code for the badge

### Coveralls

[![Coverage Status](https://coveralls.io/repos/pvillega/github-integrations-template/badge.svg?branch=master&service=github)](https://coveralls.io/github/pvillega/github-integrations-template?branch=master)

* **URL:** https://coveralls.io/
* **What:** Code coverage for your app
* **Notes:** When you setup the project it detects you don't have a badge and shows you the code in an alert at the top of the page
* **Sbt Plugin:** https://github.com/scoverage/sbt-coveralls

### Bintray

[ ![Download](https://api.bintray.com/packages/pvillega/github-integrations-template/github-integrations-template/images/download.svg) ](https://bintray.com/pvillega/github-integrations-template/github-integrations-template/_latestVersion)

* **URL:** https://bintray.com/
* **What:** Place to publish your artifacts (jars)
* **Notes:** Provides the code for the 'latest version' Badge under 'General' tab in project view
