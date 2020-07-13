DESCRIPTION = "Linux image for pipuck based on core-image-base"

IMAGE_FEATURES += "ssh-server-openssh"

require recipes-core/images/core-image-base.bb
