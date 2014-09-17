include gstreamer1.0-plugins-hantro.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=4fe869ee987a340198fb0d54c55c47f1 \
                    "
PR = "r1"

SRC_URI = "ftp://ftp.linux4sam.org/pub/demo/qtdemo/gst-hantro-g1-${PV}.tar.gz"

SRC_URI[md5sum] = "07bb4dfc47efd2ec91e1dedeac90ebf3"
SRC_URI[sha256sum] = "c2ac7fe6df1ce9bdf9f570bf17d656bbf755b50d4b5f19833e1cf6894e44bccb"

S = "${WORKDIR}/gst-hantro-g1-${PV}"
