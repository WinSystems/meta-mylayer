DESCRIPTION = "My Layer Description"
LICENSE = "MIT"

require recipes-winsys/images/winsys-image-demo.bb

CORE_IMAGE_EXTRA_INSTALL += " \
	picocom \
"

