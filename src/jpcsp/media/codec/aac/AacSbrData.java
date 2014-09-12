/*
This file is part of jpcsp.

Jpcsp is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Jpcsp is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Jpcsp.  If not, see <http://www.gnu.org/licenses/>.
 */
package jpcsp.media.codec.aac;

public class AacSbrData {
	///< Huffman tables for SBR

	static final int t_huffman_env_1_5dB_bits[] = {
	    18, 18, 18, 18, 18, 18, 19, 19,
	    19, 19, 19, 19, 19, 19, 19, 19,
	    19, 19, 19, 19, 19, 19, 19, 19,
	    19, 19, 19, 19, 19, 19, 19, 19,
	    19, 19, 17, 18, 16, 17, 18, 17,
	    16, 16, 16, 16, 15, 14, 14, 13,
	    13, 12, 11, 10,  9,  8,  7,  6,
	     5,  4,  3,  2,  2,  3,  4,  5,
	     6,  7,  8,  9, 10, 12, 13, 14,
	    14, 15, 16, 17, 16, 19, 19, 19,
	    19, 19, 19, 19, 19, 19, 19, 19,
	    19, 19, 19, 19, 19, 19, 19, 19,
	    19, 19, 19, 19, 19, 19, 19, 19,
	    19, 19, 19, 19, 19, 19, 19, 19,
	    19, 19, 19, 19, 19, 19, 19, 19,
	    19
	};

	static final int t_huffman_env_1_5dB_codes[] = {
	    0x3ffd6, 0x3ffd7, 0x3ffd8, 0x3ffd9, 0x3ffda, 0x3ffdb, 0x7ffb8, 0x7ffb9,
	    0x7ffba, 0x7ffbb, 0x7ffbc, 0x7ffbd, 0x7ffbe, 0x7ffbf, 0x7ffc0, 0x7ffc1,
	    0x7ffc2, 0x7ffc3, 0x7ffc4, 0x7ffc5, 0x7ffc6, 0x7ffc7, 0x7ffc8, 0x7ffc9,
	    0x7ffca, 0x7ffcb, 0x7ffcc, 0x7ffcd, 0x7ffce, 0x7ffcf, 0x7ffd0, 0x7ffd1,
	    0x7ffd2, 0x7ffd3, 0x1ffe6, 0x3ffd4, 0x0fff0, 0x1ffe9, 0x3ffd5, 0x1ffe7,
	    0x0fff1, 0x0ffec, 0x0ffed, 0x0ffee, 0x07ff4, 0x03ff9, 0x03ff7, 0x01ffa,
	    0x01ff9, 0x00ffb, 0x007fc, 0x003fc, 0x001fd, 0x000fd, 0x0007d, 0x0003d,
	    0x0001d, 0x0000d, 0x00005, 0x00001, 0x00000, 0x00004, 0x0000c, 0x0001c,
	    0x0003c, 0x0007c, 0x000fc, 0x001fc, 0x003fd, 0x00ffa, 0x01ff8, 0x03ff6,
	    0x03ff8, 0x07ff5, 0x0ffef, 0x1ffe8, 0x0fff2, 0x7ffd4, 0x7ffd5, 0x7ffd6,
	    0x7ffd7, 0x7ffd8, 0x7ffd9, 0x7ffda, 0x7ffdb, 0x7ffdc, 0x7ffdd, 0x7ffde,
	    0x7ffdf, 0x7ffe0, 0x7ffe1, 0x7ffe2, 0x7ffe3, 0x7ffe4, 0x7ffe5, 0x7ffe6,
	    0x7ffe7, 0x7ffe8, 0x7ffe9, 0x7ffea, 0x7ffeb, 0x7ffec, 0x7ffed, 0x7ffee,
	    0x7ffef, 0x7fff0, 0x7fff1, 0x7fff2, 0x7fff3, 0x7fff4, 0x7fff5, 0x7fff6,
	    0x7fff7, 0x7fff8, 0x7fff9, 0x7fffa, 0x7fffb, 0x7fffc, 0x7fffd, 0x7fffe,
	    0x7ffff
	};

	static final int f_huffman_env_1_5dB_bits[] = {
	    19, 19, 20, 20, 20, 20, 20, 20,
	    20, 19, 20, 20, 20, 20, 19, 20,
	    19, 19, 20, 18, 20, 20, 20, 19,
	    20, 20, 20, 19, 20, 19, 18, 19,
	    18, 18, 17, 18, 17, 17, 17, 16,
	    16, 16, 15, 15, 14, 13, 13, 12,
	    12, 11, 10,  9,  9,  8,  7,  6,
	     5,  4,  3,  2,  2,  3,  4,  5,
	     6,  8,  8,  9, 10, 11, 11, 11,
	    12, 12, 13, 13, 14, 14, 16, 16,
	    17, 17, 18, 18, 18, 18, 18, 18,
	    18, 20, 19, 20, 20, 20, 20, 20,
	    20, 19, 20, 20, 20, 20, 19, 20,
	    18, 20, 20, 19, 19, 20, 20, 20,
	    20, 20, 20, 20, 20, 20, 20, 20,
	    20
	};

	static final int f_huffman_env_1_5dB_codes[] = {
	    0x7ffe7, 0x7ffe8, 0xfffd2, 0xfffd3, 0xfffd4, 0xfffd5, 0xfffd6, 0xfffd7,
	    0xfffd8, 0x7ffda, 0xfffd9, 0xfffda, 0xfffdb, 0xfffdc, 0x7ffdb, 0xfffdd,
	    0x7ffdc, 0x7ffdd, 0xfffde, 0x3ffe4, 0xfffdf, 0xfffe0, 0xfffe1, 0x7ffde,
	    0xfffe2, 0xfffe3, 0xfffe4, 0x7ffdf, 0xfffe5, 0x7ffe0, 0x3ffe8, 0x7ffe1,
	    0x3ffe0, 0x3ffe9, 0x1ffef, 0x3ffe5, 0x1ffec, 0x1ffed, 0x1ffee, 0x0fff4,
	    0x0fff3, 0x0fff0, 0x07ff7, 0x07ff6, 0x03ffa, 0x01ffa, 0x01ff9, 0x00ffa,
	    0x00ff8, 0x007f9, 0x003fb, 0x001fc, 0x001fa, 0x000fb, 0x0007c, 0x0003c,
	    0x0001c, 0x0000c, 0x00005, 0x00001, 0x00000, 0x00004, 0x0000d, 0x0001d,
	    0x0003d, 0x000fa, 0x000fc, 0x001fb, 0x003fa, 0x007f8, 0x007fa, 0x007fb,
	    0x00ff9, 0x00ffb, 0x01ff8, 0x01ffb, 0x03ff8, 0x03ff9, 0x0fff1, 0x0fff2,
	    0x1ffea, 0x1ffeb, 0x3ffe1, 0x3ffe2, 0x3ffea, 0x3ffe3, 0x3ffe6, 0x3ffe7,
	    0x3ffeb, 0xfffe6, 0x7ffe2, 0xfffe7, 0xfffe8, 0xfffe9, 0xfffea, 0xfffeb,
	    0xfffec, 0x7ffe3, 0xfffed, 0xfffee, 0xfffef, 0xffff0, 0x7ffe4, 0xffff1,
	    0x3ffec, 0xffff2, 0xffff3, 0x7ffe5, 0x7ffe6, 0xffff4, 0xffff5, 0xffff6,
	    0xffff7, 0xffff8, 0xffff9, 0xffffa, 0xffffb, 0xffffc, 0xffffd, 0xffffe,
	    0xfffff
	};

	static final int t_huffman_env_bal_1_5dB_bits[] = {
	    16, 16, 16, 16, 16, 16, 16, 16,
	    16, 16, 16, 16, 16, 16, 16, 16,
	    16, 16, 12, 11,  9,  7,  5,  3,
	     1,  2,  4,  6,  8, 11, 12, 15,
	    16, 16, 16, 16, 16, 16, 16, 17,
	    17, 17, 17, 17, 17, 17, 17, 17,
	    17
	};

	static final int t_huffman_env_bal_1_5dB_codes[] = {
	    0x0ffe4, 0x0ffe5, 0x0ffe6, 0x0ffe7, 0x0ffe8, 0x0ffe9, 0x0ffea, 0x0ffeb,
	    0x0ffec, 0x0ffed, 0x0ffee, 0x0ffef, 0x0fff0, 0x0fff1, 0x0fff2, 0x0fff3,
	    0x0fff4, 0x0ffe2, 0x00ffc, 0x007fc, 0x001fe, 0x0007e, 0x0001e, 0x00006,
	    0x00000, 0x00002, 0x0000e, 0x0003e, 0x000fe, 0x007fd, 0x00ffd, 0x07ff0,
	    0x0ffe3, 0x0fff5, 0x0fff6, 0x0fff7, 0x0fff8, 0x0fff9, 0x0fffa, 0x1fff6,
	    0x1fff7, 0x1fff8, 0x1fff9, 0x1fffa, 0x1fffb, 0x1fffc, 0x1fffd, 0x1fffe,
	    0x1ffff
	};

	static final int f_huffman_env_bal_1_5dB_bits[] = {
	    18, 18, 18, 18, 18, 18, 18, 18,
	    18, 18, 18, 18, 18, 18, 18, 16,
	    17, 14, 11, 11,  8,  7,  4,  2,
	     1,  3,  5,  6,  9, 11, 12, 15,
	    16, 18, 18, 18, 18, 18, 18, 18,
	    18, 18, 18, 18, 18, 18, 18, 19,
	    19
	};

	static final int f_huffman_env_bal_1_5dB_codes[] = {
	    0x3ffe2, 0x3ffe3, 0x3ffe4, 0x3ffe5, 0x3ffe6, 0x3ffe7, 0x3ffe8, 0x3ffe9,
	    0x3ffea, 0x3ffeb, 0x3ffec, 0x3ffed, 0x3ffee, 0x3ffef, 0x3fff0, 0x0fff7,
	    0x1fff0, 0x03ffc, 0x007fe, 0x007fc, 0x000fe, 0x0007e, 0x0000e, 0x00002,
	    0x00000, 0x00006, 0x0001e, 0x0003e, 0x001fe, 0x007fd, 0x00ffe, 0x07ffa,
	    0x0fff6, 0x3fff1, 0x3fff2, 0x3fff3, 0x3fff4, 0x3fff5, 0x3fff6, 0x3fff7,
	    0x3fff8, 0x3fff9, 0x3fffa, 0x3fffb, 0x3fffc, 0x3fffd, 0x3fffe, 0x7fffe,
	    0x7ffff
	};

	static final int t_huffman_env_3_0dB_bits[] = {
	    18, 18, 19, 19, 19, 19, 19, 19,
	    19, 19, 19, 19, 19, 19, 19, 19,
	    19, 17, 16, 16, 16, 14, 14, 14,
	    13, 12, 11,  8,  6,  4,  2,  1,
	     3,  5,  7,  9, 11, 13, 14, 14,
	    15, 16, 17, 18, 19, 19, 19, 19,
	    19, 19, 19, 19, 19, 19, 19, 19,
	    19, 19, 19, 19, 19, 19, 19
	};

	static final int t_huffman_env_3_0dB_codes[] = {
	    0x3ffed, 0x3ffee, 0x7ffde, 0x7ffdf, 0x7ffe0, 0x7ffe1, 0x7ffe2, 0x7ffe3,
	    0x7ffe4, 0x7ffe5, 0x7ffe6, 0x7ffe7, 0x7ffe8, 0x7ffe9, 0x7ffea, 0x7ffeb,
	    0x7ffec, 0x1fff4, 0x0fff7, 0x0fff9, 0x0fff8, 0x03ffb, 0x03ffa, 0x03ff8,
	    0x01ffa, 0x00ffc, 0x007fc, 0x000fe, 0x0003e, 0x0000e, 0x00002, 0x00000,
	    0x00006, 0x0001e, 0x0007e, 0x001fe, 0x007fd, 0x01ffb, 0x03ff9, 0x03ffc,
	    0x07ffa, 0x0fff6, 0x1fff5, 0x3ffec, 0x7ffed, 0x7ffee, 0x7ffef, 0x7fff0,
	    0x7fff1, 0x7fff2, 0x7fff3, 0x7fff4, 0x7fff5, 0x7fff6, 0x7fff7, 0x7fff8,
	    0x7fff9, 0x7fffa, 0x7fffb, 0x7fffc, 0x7fffd, 0x7fffe, 0x7ffff
	};

	static final int f_huffman_env_3_0dB_bits[] = {
	    20, 20, 20, 20, 20, 20, 20, 18,
	    19, 19, 19, 19, 18, 18, 20, 19,
	    17, 18, 17, 16, 16, 15, 14, 12,
	    11, 10,  9,  8,  6,  4,  2,  1,
	     3,  5,  8,  9, 10, 11, 12, 13,
	    14, 15, 15, 16, 16, 17, 17, 18,
	    18, 18, 20, 19, 19, 19, 20, 19,
	    19, 20, 20, 20, 20, 20, 20
	};

	static final int f_huffman_env_3_0dB_codes[] = {
	    0xffff0, 0xffff1, 0xffff2, 0xffff3, 0xffff4, 0xffff5, 0xffff6, 0x3fff3,
	    0x7fff5, 0x7ffee, 0x7ffef, 0x7fff6, 0x3fff4, 0x3fff2, 0xffff7, 0x7fff0,
	    0x1fff5, 0x3fff0, 0x1fff4, 0x0fff7, 0x0fff6, 0x07ff8, 0x03ffb, 0x00ffd,
	    0x007fd, 0x003fd, 0x001fd, 0x000fd, 0x0003e, 0x0000e, 0x00002, 0x00000,
	    0x00006, 0x0001e, 0x000fc, 0x001fc, 0x003fc, 0x007fc, 0x00ffc, 0x01ffc,
	    0x03ffa, 0x07ff9, 0x07ffa, 0x0fff8, 0x0fff9, 0x1fff6, 0x1fff7, 0x3fff5,
	    0x3fff6, 0x3fff1, 0xffff8, 0x7fff1, 0x7fff2, 0x7fff3, 0xffff9, 0x7fff7,
	    0x7fff4, 0xffffa, 0xffffb, 0xffffc, 0xffffd, 0xffffe, 0xfffff
	};

	static final int t_huffman_env_bal_3_0dB_bits[] = {
	    13, 13, 13, 13, 13, 13, 13, 12,
	     8,  7,  4,  3,  1,  2,  5,  6,
	     9, 13, 13, 13, 13, 13, 13, 14,
	    14
	};

	static final int t_huffman_env_bal_3_0dB_codes[] = {
	    0x1ff2, 0x1ff3, 0x1ff4, 0x1ff5, 0x1ff6, 0x1ff7, 0x1ff8, 0x0ff8,
	    0x00fe, 0x007e, 0x000e, 0x0006, 0x0000, 0x0002, 0x001e, 0x003e,
	    0x01fe, 0x1ff9, 0x1ffa, 0x1ffb, 0x1ffc, 0x1ffd, 0x1ffe, 0x3ffe,
	    0x3fff
	};

	static final int f_huffman_env_bal_3_0dB_bits[] = {
	    13, 13, 13, 13, 13, 14, 14, 11,
	     8,  7,  4,  2,  1,  3,  5,  6,
	     9, 12, 13, 14, 14, 14, 14, 14,
	    14
	};

	static final int f_huffman_env_bal_3_0dB_codes[] = {
	    0x1ff7, 0x1ff8, 0x1ff9, 0x1ffa, 0x1ffb, 0x3ff8, 0x3ff9, 0x07fc,
	    0x00fe, 0x007e, 0x000e, 0x0002, 0x0000, 0x0006, 0x001e, 0x003e,
	    0x01fe, 0x0ffa, 0x1ff6, 0x3ffa, 0x3ffb, 0x3ffc, 0x3ffd, 0x3ffe,
	    0x3fff
	};

	static final int t_huffman_noise_3_0dB_bits[] = {
	    13, 13, 13, 13, 13, 13, 13, 13,
	    13, 13, 13, 13, 13, 13, 13, 13,
	    13, 13, 13, 13, 13, 13, 13, 13,
	    13, 13, 11,  8,  6,  4,  3,  1,
	     2,  5,  8, 10, 13, 13, 13, 13,
	    13, 13, 13, 13, 13, 13, 13, 13,
	    13, 13, 13, 13, 13, 13, 13, 13,
	    13, 13, 13, 13, 13, 14, 14
	};

	static final int t_huffman_noise_3_0dB_codes[] = {
	    0x1fce, 0x1fcf, 0x1fd0, 0x1fd1, 0x1fd2, 0x1fd3, 0x1fd4, 0x1fd5,
	    0x1fd6, 0x1fd7, 0x1fd8, 0x1fd9, 0x1fda, 0x1fdb, 0x1fdc, 0x1fdd,
	    0x1fde, 0x1fdf, 0x1fe0, 0x1fe1, 0x1fe2, 0x1fe3, 0x1fe4, 0x1fe5,
	    0x1fe6, 0x1fe7, 0x07f2, 0x00fd, 0x003e, 0x000e, 0x0006, 0x0000,
	    0x0002, 0x001e, 0x00fc, 0x03f8, 0x1fcc, 0x1fe8, 0x1fe9, 0x1fea,
	    0x1feb, 0x1fec, 0x1fcd, 0x1fed, 0x1fee, 0x1fef, 0x1ff0, 0x1ff1,
	    0x1ff2, 0x1ff3, 0x1ff4, 0x1ff5, 0x1ff6, 0x1ff7, 0x1ff8, 0x1ff9,
	    0x1ffa, 0x1ffb, 0x1ffc, 0x1ffd, 0x1ffe, 0x3ffe, 0x3fff
	};

	static final int t_huffman_noise_bal_3_0dB_bits[] = {
	    8, 8, 8, 8, 8, 8, 8, 8,
	    8, 8, 5, 2, 1, 3, 6, 8,
	    8, 8, 8, 8, 8, 8, 8, 8,
	    8
	};

	static final int t_huffman_noise_bal_3_0dB_codes[] = {
	    0xec, 0xed, 0xee, 0xef, 0xf0, 0xf1, 0xf2, 0xf3,
	    0xf4, 0xf5, 0x1c, 0x02, 0x00, 0x06, 0x3a, 0xf6,
	    0xf7, 0xf8, 0xf9, 0xfa, 0xfb, 0xfc, 0xfd, 0xfe,
	    0xff
	};

	static final int sbr_offset[][] = {
	    {-8, -7, -6, -5, -4, -3, -2, -1,  0,  1,  2,  3,  4,  5,  6,  7}, //             fs_sbr  = 16000 Hz
	    {-5, -4, -3, -2, -1,  0,  1,  2,  3,  4,  5,  6,  7,  9, 11, 13}, //             fs_sbr  = 22050 Hz
	    {-5, -3, -2, -1,  0,  1,  2,  3,  4,  5,  6,  7,  9, 11, 13, 16}, //             fs_sbr  = 24000 Hz
	    {-6, -4, -2, -1,  0,  1,  2,  3,  4,  5,  6,  7,  9, 11, 13, 16}, //             fs_sbr  = 32000 Hz
	    {-4, -2, -1,  0,  1,  2,  3,  4,  5,  6,  7,  9, 11, 13, 16, 20}, // 44100 Hz <= fs_sbr <= 64000 Hz
	    {-2, -1,  0,  1,  2,  3,  4,  5,  6,  7,  9, 11, 13, 16, 20, 24}  // 64000 Hz <  fs_sbr
	};

	///< window coefficients for analysis/synthesis QMF banks
	static final float sbr_qmf_window_ds[] = new float[320];
	static final float sbr_qmf_window_us[] = new float[] {
	     0.0000000000f, -0.0005525286f, -0.0005617692f, -0.0004947518f,
	    -0.0004875227f, -0.0004893791f, -0.0005040714f, -0.0005226564f,
	    -0.0005466565f, -0.0005677802f, -0.0005870930f, -0.0006132747f,
	    -0.0006312493f, -0.0006540333f, -0.0006777690f, -0.0006941614f,
	    -0.0007157736f, -0.0007255043f, -0.0007440941f, -0.0007490598f,
	    -0.0007681371f, -0.0007724848f, -0.0007834332f, -0.0007779869f,
	    -0.0007803664f, -0.0007801449f, -0.0007757977f, -0.0007630793f,
	    -0.0007530001f, -0.0007319357f, -0.0007215391f, -0.0006917937f,
	    -0.0006650415f, -0.0006341594f, -0.0005946118f, -0.0005564576f,
	    -0.0005145572f, -0.0004606325f, -0.0004095121f, -0.0003501175f,
	    -0.0002896981f, -0.0002098337f, -0.0001446380f, -0.0000617334f,
	     0.0000134949f,  0.0001094383f,  0.0002043017f,  0.0002949531f,
	     0.0004026540f,  0.0005107388f,  0.0006239376f,  0.0007458025f,
	     0.0008608443f,  0.0009885988f,  0.0011250155f,  0.0012577884f,
	     0.0013902494f,  0.0015443219f,  0.0016868083f,  0.0018348265f,
	     0.0019841140f,  0.0021461583f,  0.0023017254f,  0.0024625616f,
	     0.0026201758f,  0.0027870464f,  0.0029469447f,  0.0031125420f,
	     0.0032739613f,  0.0034418874f,  0.0036008268f,  0.0037603922f,
	     0.0039207432f,  0.0040819753f,  0.0042264269f,  0.0043730719f,
	     0.0045209852f,  0.0046606460f,  0.0047932560f,  0.0049137603f,
	     0.0050393022f,  0.0051407353f,  0.0052461166f,  0.0053471681f,
	     0.0054196775f,  0.0054876040f,  0.0055475714f,  0.0055938023f,
	     0.0056220643f,  0.0056455196f,  0.0056389199f,  0.0056266114f,
	     0.0055917128f,  0.0055404363f,  0.0054753783f,  0.0053838975f,
	     0.0052715758f,  0.0051382275f,  0.0049839687f,  0.0048109469f,
	     0.0046039530f,  0.0043801861f,  0.0041251642f,  0.0038456408f,
	     0.0035401246f,  0.0032091885f,  0.0028446757f,  0.0024508540f,
	     0.0020274176f,  0.0015784682f,  0.0010902329f,  0.0005832264f,
	     0.0000276045f, -0.0005464280f, -0.0011568135f, -0.0018039472f,
	    -0.0024826723f, -0.0031933778f, -0.0039401124f, -0.0047222596f,
	    -0.0055337211f, -0.0063792293f, -0.0072615816f, -0.0081798233f,
	    -0.0091325329f, -0.0101150215f, -0.0111315548f, -0.0121849995f,
	     0.0132718220f,  0.0143904666f,  0.0155405553f,  0.0167324712f,
	     0.0179433381f,  0.0191872431f,  0.0204531793f,  0.0217467550f,
	     0.0230680169f,  0.0244160992f,  0.0257875847f,  0.0271859429f,
	     0.0286072173f,  0.0300502657f,  0.0315017608f,  0.0329754081f,
	     0.0344620948f,  0.0359697560f,  0.0374812850f,  0.0390053679f,
	     0.0405349170f,  0.0420649094f,  0.0436097542f,  0.0451488405f,
	     0.0466843027f,  0.0482165720f,  0.0497385755f,  0.0512556155f,
	     0.0527630746f,  0.0542452768f,  0.0557173648f,  0.0571616450f,
	     0.0585915683f,  0.0599837480f,  0.0613455171f,  0.0626857808f,
	     0.0639715898f,  0.0652247106f,  0.0664367512f,  0.0676075985f,
	     0.0687043828f,  0.0697630244f,  0.0707628710f,  0.0717002673f,
	     0.0725682583f,  0.0733620255f,  0.0741003642f,  0.0747452558f,
	     0.0753137336f,  0.0758008358f,  0.0761992479f,  0.0764992170f,
	     0.0767093490f,  0.0768173975f,  0.0768230011f,  0.0767204924f,
	     0.0765050718f,  0.0761748321f,  0.0757305756f,  0.0751576255f,
	     0.0744664394f,  0.0736406005f,  0.0726774642f,  0.0715826364f,
	     0.0703533073f,  0.0689664013f,  0.0674525021f,  0.0657690668f,
	     0.0639444805f,  0.0619602779f,  0.0598166570f,  0.0575152691f,
	     0.0550460034f,  0.0524093821f,  0.0495978676f,  0.0466303305f,
	     0.0434768782f,  0.0401458278f,  0.0366418116f,  0.0329583930f,
	     0.0290824006f,  0.0250307561f,  0.0207997072f,  0.0163701258f,
	     0.0117623832f,  0.0069636862f,  0.0019765601f, -0.0032086896f,
	    -0.0085711749f, -0.0141288827f, -0.0198834129f, -0.0258227288f,
	    -0.0319531274f, -0.0382776572f, -0.0447806821f, -0.0514804176f,
	    -0.0583705326f, -0.0654409853f, -0.0726943300f, -0.0801372934f,
	    -0.0877547536f, -0.0955533352f, -0.1035329531f, -0.1116826931f,
	    -0.1200077984f, -0.1285002850f, -0.1371551761f, -0.1459766491f,
	    -0.1549607071f, -0.1640958855f, -0.1733808172f, -0.1828172548f,
	    -0.1923966745f, -0.2021250176f, -0.2119735853f, -0.2219652696f,
	    -0.2320690870f, -0.2423016884f, -0.2526480309f, -0.2631053299f,
	    -0.2736634040f, -0.2843214189f, -0.2950716717f, -0.3059098575f,
	    -0.3168278913f, -0.3278113727f, -0.3388722693f, -0.3499914122f,
	     0.3611589903f,  0.3723795546f,  0.3836350013f,  0.3949211761f,
	     0.4062317676f,  0.4175696896f,  0.4289119920f,  0.4402553754f,
	     0.4515996535f,  0.4629308085f,  0.4742453214f,  0.4855253091f,
	     0.4967708254f,  0.5079817500f,  0.5191234970f,  0.5302240895f,
	     0.5412553448f,  0.5522051258f,  0.5630789140f,  0.5738524131f,
	     0.5845403235f,  0.5951123086f,  0.6055783538f,  0.6159109932f,
	     0.6261242695f,  0.6361980107f,  0.6461269695f,  0.6559016302f,
	     0.6655139880f,  0.6749663190f,  0.6842353293f,  0.6933282376f,
	     0.7022388719f,  0.7109410426f,  0.7194462634f,  0.7277448900f,
	     0.7358211758f,  0.7436827863f,  0.7513137456f,  0.7587080760f,
	     0.7658674865f,  0.7727780881f,  0.7794287519f,  0.7858353120f,
	     0.7919735841f,  0.7978466413f,  0.8034485751f,  0.8087695004f,
	     0.8138191270f,  0.8185776004f,  0.8230419890f,  0.8272275347f,
	     0.8311038457f,  0.8346937361f,  0.8379717337f,  0.8409541392f,
	     0.8436238281f,  0.8459818469f,  0.8480315777f,  0.8497805198f,
	     0.8511971524f,  0.8523047035f,  0.8531020949f,  0.8535720573f,
	     0.8537385600f
	};

	/* First eight entries repeated at end to simplify SIMD implementations. */
	public static final float ff_sbr_noise_table[][] = new float[][] {
		{-0.99948153278296f, -0.59483417516607f}, { 0.97113454393991f, -0.67528515225647f},
		{ 0.14130051758487f, -0.95090983575689f}, {-0.47005496701697f, -0.37340549728647f},
		{ 0.80705063769351f,  0.29653668284408f}, {-0.38981478896926f,  0.89572605717087f},
		{-0.01053049862020f, -0.66959058036166f}, {-0.91266367957293f, -0.11522938140034f},
		{ 0.54840422910309f,  0.75221367176302f}, { 0.40009252867955f, -0.98929400334421f},
		{-0.99867974711855f, -0.88147068645358f}, {-0.95531076805040f,  0.90908757154593f},
		{-0.45725933317144f, -0.56716323646760f}, {-0.72929675029275f, -0.98008272727324f},
		{ 0.75622801399036f,  0.20950329995549f}, { 0.07069442601050f, -0.78247898470706f},
		{ 0.74496252926055f, -0.91169004445807f}, {-0.96440182703856f, -0.94739918296622f},
		{ 0.30424629369539f, -0.49438267012479f}, { 0.66565033746925f,  0.64652935542491f},
		{ 0.91697008020594f,  0.17514097332009f}, {-0.70774918760427f,  0.52548653416543f},
		{-0.70051415345560f, -0.45340028808763f}, {-0.99496513054797f, -0.90071908066973f},
		{ 0.98164490790123f, -0.77463155528697f}, {-0.54671580548181f, -0.02570928536004f},
		{-0.01689629065389f,  0.00287506445732f}, {-0.86110349531986f,  0.42548583726477f},
		{-0.98892980586032f, -0.87881132267556f}, { 0.51756627678691f,  0.66926784710139f},
		{-0.99635026409640f, -0.58107730574765f}, {-0.99969370862163f,  0.98369989360250f},
		{ 0.55266258627194f,  0.59449057465591f}, { 0.34581177741673f,  0.94879421061866f},
		{ 0.62664209577999f, -0.74402970906471f}, {-0.77149701404973f, -0.33883658042801f},
		{-0.91592244254432f,  0.03687901376713f}, {-0.76285492357887f, -0.91371867919124f},
		{ 0.79788337195331f, -0.93180971199849f}, { 0.54473080610200f, -0.11919206037186f},
		{-0.85639281671058f,  0.42429854760451f}, {-0.92882402971423f,  0.27871809078609f},
		{-0.11708371046774f, -0.99800843444966f}, { 0.21356749817493f, -0.90716295627033f},
		{-0.76191692573909f,  0.99768118356265f}, { 0.98111043100884f, -0.95854459734407f},
		{-0.85913269895572f,  0.95766566168880f}, {-0.93307242253692f,  0.49431757696466f},
		{ 0.30485754879632f, -0.70540034357529f}, { 0.85289650925190f,  0.46766131791044f},
		{ 0.91328082618125f, -0.99839597361769f}, {-0.05890199924154f,  0.70741827819497f},
		{ 0.28398686150148f,  0.34633555702188f}, { 0.95258164539612f, -0.54893416026939f},
		{-0.78566324168507f, -0.75568541079691f}, {-0.95789495447877f, -0.20423194696966f},
		{ 0.82411158711197f,  0.96654618432562f}, {-0.65185446735885f, -0.88734990773289f},
		{-0.93643603134666f,  0.99870790442385f}, { 0.91427159529618f, -0.98290505544444f},
		{-0.70395684036886f,  0.58796798221039f}, { 0.00563771969365f,  0.61768196727244f},
		{ 0.89065051931895f,  0.52783352697585f}, {-0.68683707712762f,  0.80806944710339f},
		{ 0.72165342518718f, -0.69259857349564f}, {-0.62928247730667f,  0.13627037407335f},
		{ 0.29938434065514f, -0.46051329682246f}, {-0.91781958879280f, -0.74012716684186f},
		{ 0.99298717043688f,  0.40816610075661f}, { 0.82368298622748f, -0.74036047190173f},
		{-0.98512833386833f, -0.99972330709594f}, {-0.95915368242257f, -0.99237800466040f},
		{-0.21411126572790f, -0.93424819052545f}, {-0.68821476106884f, -0.26892306315457f},
		{ 0.91851997982317f,  0.09358228901785f}, {-0.96062769559127f,  0.36099095133739f},
		{ 0.51646184922287f, -0.71373332873917f}, { 0.61130721139669f,  0.46950141175917f},
		{ 0.47336129371299f, -0.27333178296162f}, { 0.90998308703519f,  0.96715662938132f},
		{ 0.44844799194357f,  0.99211574628306f}, { 0.66614891079092f,  0.96590176169121f},
		{ 0.74922239129237f, -0.89879858826087f}, {-0.99571588506485f,  0.52785521494349f},
		{ 0.97401082477563f, -0.16855870075190f}, { 0.72683747733879f, -0.48060774432251f},
		{ 0.95432193457128f,  0.68849603408441f}, {-0.72962208425191f, -0.76608443420917f},
		{-0.85359479233537f,  0.88738125901579f}, {-0.81412430338535f, -0.97480768049637f},
		{-0.87930772356786f,  0.74748307690436f}, {-0.71573331064977f, -0.98570608178923f},
		{ 0.83524300028228f,  0.83702537075163f}, {-0.48086065601423f, -0.98848504923531f},
		{ 0.97139128574778f,  0.80093621198236f}, { 0.51992825347895f,  0.80247631400510f},
		{-0.00848591195325f, -0.76670128000486f}, {-0.70294374303036f,  0.55359910445577f},
		{-0.95894428168140f, -0.43265504344783f}, { 0.97079252950321f,  0.09325857238682f},
		{-0.92404293670797f,  0.85507704027855f}, {-0.69506469500450f,  0.98633412625459f},
		{ 0.26559203620024f,  0.73314307966524f}, { 0.28038443336943f,  0.14537913654427f},
		{-0.74138124825523f,  0.99310339807762f}, {-0.01752795995444f, -0.82616635284178f},
		{-0.55126773094930f, -0.98898543862153f}, { 0.97960898850996f, -0.94021446752851f},
		{-0.99196309146936f,  0.67019017358456f}, {-0.67684928085260f,  0.12631491649378f},
		{ 0.09140039465500f, -0.20537731453108f}, {-0.71658965751996f, -0.97788200391224f},
		{ 0.81014640078925f,  0.53722648362443f}, { 0.40616991671205f, -0.26469008598449f},
		{-0.67680188682972f,  0.94502052337695f}, { 0.86849774348749f, -0.18333598647899f},
		{-0.99500381284851f, -0.02634122068550f}, { 0.84329189340667f,  0.10406957462213f},
		{-0.09215968531446f,  0.69540012101253f}, { 0.99956173327206f, -0.12358542001404f},
		{-0.79732779473535f, -0.91582524736159f}, { 0.96349973642406f,  0.96640458041000f},
		{-0.79942778496547f,  0.64323902822857f}, {-0.11566039853896f,  0.28587846253726f},
		{-0.39922954514662f,  0.94129601616966f}, { 0.99089197565987f, -0.92062625581587f},
		{ 0.28631285179909f, -0.91035047143603f}, {-0.83302725605608f, -0.67330410892084f},
		{ 0.95404443402072f,  0.49162765398743f}, {-0.06449863579434f,  0.03250560813135f},
		{-0.99575054486311f,  0.42389784469507f}, {-0.65501142790847f,  0.82546114655624f},
		{-0.81254441908887f, -0.51627234660629f}, {-0.99646369485481f,  0.84490533520752f},
		{ 0.00287840603348f,  0.64768261158166f}, { 0.70176989408455f, -0.20453028573322f},
		{ 0.96361882270190f,  0.40706967140989f}, {-0.68883758192426f,  0.91338958840772f},
		{-0.34875585502238f,  0.71472290693300f}, { 0.91980081243087f,  0.66507455644919f},
		{-0.99009048343881f,  0.85868021604848f}, { 0.68865791458395f,  0.55660316809678f},
		{-0.99484402129368f, -0.20052559254934f}, { 0.94214511408023f, -0.99696425367461f},
		{-0.67414626793544f,  0.49548221180078f}, {-0.47339353684664f, -0.85904328834047f},
		{ 0.14323651387360f, -0.94145598222488f}, {-0.29268293575672f,  0.05759224927952f},
		{ 0.43793861458754f, -0.78904969892724f}, {-0.36345126374441f,  0.64874435357162f},
		{-0.08750604656825f,  0.97686944362527f}, {-0.96495267812511f, -0.53960305946511f},
		{ 0.55526940659947f,  0.78891523734774f}, { 0.73538215752630f,  0.96452072373404f},
		{-0.30889773919437f, -0.80664389776860f}, { 0.03574995626194f, -0.97325616900959f},
		{ 0.98720684660488f,  0.48409133691962f}, {-0.81689296271203f, -0.90827703628298f},
		{ 0.67866860118215f,  0.81284503870856f}, {-0.15808569732583f,  0.85279555024382f},
		{ 0.80723395114371f, -0.24717418514605f}, { 0.47788757329038f, -0.46333147839295f},
		{ 0.96367554763201f,  0.38486749303242f}, {-0.99143875716818f, -0.24945277239809f},
		{ 0.83081876925833f, -0.94780851414763f}, {-0.58753191905341f,  0.01290772389163f},
		{ 0.95538108220960f, -0.85557052096538f}, {-0.96490920476211f, -0.64020970923102f},
		{-0.97327101028521f,  0.12378128133110f}, { 0.91400366022124f,  0.57972471346930f},
		{-0.99925837363824f,  0.71084847864067f}, {-0.86875903507313f, -0.20291699203564f},
		{-0.26240034795124f, -0.68264554369108f}, {-0.24664412953388f, -0.87642273115183f},
		{ 0.02416275806869f,  0.27192914288905f}, { 0.82068619590515f, -0.85087787994476f},
		{ 0.88547373760759f, -0.89636802901469f}, {-0.18173078152226f, -0.26152145156800f},
		{ 0.09355476558534f,  0.54845123045604f}, {-0.54668414224090f,  0.95980774020221f},
		{ 0.37050990604091f, -0.59910140383171f}, {-0.70373594262891f,  0.91227665827081f},
		{-0.34600785879594f, -0.99441426144200f}, {-0.68774481731008f, -0.30238837956299f},
		{-0.26843291251234f,  0.83115668004362f}, { 0.49072334613242f, -0.45359708737775f},
		{ 0.38975993093975f,  0.95515358099121f}, {-0.97757125224150f,  0.05305894580606f},
		{-0.17325552859616f, -0.92770672250494f}, { 0.99948035025744f,  0.58285545563426f},
		{-0.64946246527458f,  0.68645507104960f}, {-0.12016920576437f, -0.57147322153312f},
		{-0.58947456517751f, -0.34847132454388f}, {-0.41815140454465f,  0.16276422358861f},
		{ 0.99885650204884f,  0.11136095490444f}, {-0.56649614128386f, -0.90494866361587f},
		{ 0.94138021032330f,  0.35281916733018f}, {-0.75725076534641f,  0.53650549640587f},
		{ 0.20541973692630f, -0.94435144369918f}, { 0.99980371023351f,  0.79835913565599f},
		{ 0.29078277605775f,  0.35393777921520f}, {-0.62858772103030f,  0.38765693387102f},
		{ 0.43440904467688f, -0.98546330463232f}, {-0.98298583762390f,  0.21021524625209f},
		{ 0.19513029146934f, -0.94239832251867f}, {-0.95476662400101f,  0.98364554179143f},
		{ 0.93379635304810f, -0.70881994583682f}, {-0.85235410573336f, -0.08342347966410f},
		{-0.86425093011245f, -0.45795025029466f}, { 0.38879779059045f,  0.97274429344593f},
		{ 0.92045124735495f, -0.62433652524220f}, { 0.89162532251878f,  0.54950955570563f},
		{-0.36834336949252f,  0.96458298020975f}, { 0.93891760988045f, -0.89968353740388f},
		{ 0.99267657565094f, -0.03757034316958f}, {-0.94063471614176f,  0.41332338538963f},
		{ 0.99740224117019f, -0.16830494996370f}, {-0.35899413170555f, -0.46633226649613f},
		{ 0.05237237274947f, -0.25640361602661f}, { 0.36703583957424f, -0.38653265641875f},
		{ 0.91653180367913f, -0.30587628726597f}, { 0.69000803499316f,  0.90952171386132f},
		{-0.38658751133527f,  0.99501571208985f}, {-0.29250814029851f,  0.37444994344615f},
		{-0.60182204677608f,  0.86779651036123f}, {-0.97418588163217f,  0.96468523666475f},
		{ 0.88461574003963f,  0.57508405276414f}, { 0.05198933055162f,  0.21269661669964f},
		{-0.53499621979720f,  0.97241553731237f}, {-0.49429560226497f,  0.98183865291903f},
		{-0.98935142339139f, -0.40249159006933f}, {-0.98081380091130f, -0.72856895534041f},
		{-0.27338148835532f,  0.99950922447209f}, { 0.06310802338302f, -0.54539587529618f},
		{-0.20461677199539f, -0.14209977628489f}, { 0.66223843141647f,  0.72528579940326f},
		{-0.84764345483665f,  0.02372316801261f}, {-0.89039863483811f,  0.88866581484602f},
		{ 0.95903308477986f,  0.76744927173873f}, { 0.73504123909879f, -0.03747203173192f},
		{-0.31744434966056f, -0.36834111883652f}, {-0.34110827591623f,  0.40211222807691f},
		{ 0.47803883714199f, -0.39423219786288f}, { 0.98299195879514f,  0.01989791390047f},
		{-0.30963073129751f, -0.18076720599336f}, { 0.99992588229018f, -0.26281872094289f},
		{-0.93149731080767f, -0.98313162570490f}, { 0.99923472302773f, -0.80142993767554f},
		{-0.26024169633417f, -0.75999759855752f}, {-0.35712514743563f,  0.19298963768574f},
		{-0.99899084509530f,  0.74645156992493f}, { 0.86557171579452f,  0.55593866696299f},
		{ 0.33408042438752f,  0.86185953874709f}, { 0.99010736374716f,  0.04602397576623f},
		{-0.66694269691195f, -0.91643611810148f}, { 0.64016792079480f,  0.15649530836856f},
		{ 0.99570534804836f,  0.45844586038111f}, {-0.63431466947340f,  0.21079116459234f},
		{-0.07706847005931f, -0.89581437101329f}, { 0.98590090577724f,  0.88241721133981f},
		{ 0.80099335254678f, -0.36851896710853f}, { 0.78368131392666f,  0.45506999802597f},
		{ 0.08707806671691f,  0.80938994918745f}, {-0.86811883080712f,  0.39347308654705f},
		{-0.39466529740375f, -0.66809432114456f}, { 0.97875325649683f, -0.72467840967746f},
		{-0.95038560288864f,  0.89563219587625f}, { 0.17005239424212f,  0.54683053962658f},
		{-0.76910792026848f, -0.96226617549298f}, { 0.99743281016846f,  0.42697157037567f},
		{ 0.95437383549973f,  0.97002324109952f}, { 0.99578905365569f, -0.54106826257356f},
		{ 0.28058259829990f, -0.85361420634036f}, { 0.85256524470573f, -0.64567607735589f},
		{-0.50608540105128f, -0.65846015480300f}, {-0.97210735183243f, -0.23095213067791f},
		{ 0.95424048234441f, -0.99240147091219f}, {-0.96926570524023f,  0.73775654896574f},
		{ 0.30872163214726f,  0.41514960556126f}, {-0.24523839572639f,  0.63206633394807f},
		{-0.33813265086024f, -0.38661779441897f}, {-0.05826828420146f, -0.06940774188029f},
		{-0.22898461455054f,  0.97054853316316f}, {-0.18509915019881f,  0.47565762892084f},
		{-0.10488238045009f, -0.87769947402394f}, {-0.71886586182037f,  0.78030982480538f},
		{ 0.99793873738654f,  0.90041310491497f}, { 0.57563307626120f, -0.91034337352097f},
		{ 0.28909646383717f,  0.96307783970534f}, { 0.42188998312520f,  0.48148651230437f},
		{ 0.93335049681047f, -0.43537023883588f}, {-0.97087374418267f,  0.86636445711364f},
		{ 0.36722871286923f,  0.65291654172961f}, {-0.81093025665696f,  0.08778370229363f},
		{-0.26240603062237f, -0.92774095379098f}, { 0.83996497984604f,  0.55839849139647f},
		{-0.99909615720225f, -0.96024605713970f}, { 0.74649464155061f,  0.12144893606462f},
		{-0.74774595569805f, -0.26898062008959f}, { 0.95781667469567f, -0.79047927052628f},
		{ 0.95472308713099f, -0.08588776019550f}, { 0.48708332746299f,  0.99999041579432f},
		{ 0.46332038247497f,  0.10964126185063f}, {-0.76497004940162f,  0.89210929242238f},
		{ 0.57397389364339f,  0.35289703373760f}, { 0.75374316974495f,  0.96705214651335f},
		{-0.59174397685714f, -0.89405370422752f}, { 0.75087906691890f, -0.29612672982396f},
		{-0.98607857336230f,  0.25034911730023f}, {-0.40761056640505f, -0.90045573444695f},
		{ 0.66929266740477f,  0.98629493401748f}, {-0.97463695257310f, -0.00190223301301f},
		{ 0.90145509409859f,  0.99781390365446f}, {-0.87259289048043f,  0.99233587353666f},
		{-0.91529461447692f, -0.15698707534206f}, {-0.03305738840705f, -0.37205262859764f},
		{ 0.07223051368337f, -0.88805001733626f}, { 0.99498012188353f,  0.97094358113387f},
		{-0.74904939500519f,  0.99985483641521f}, { 0.04585228574211f,  0.99812337444082f},
		{-0.89054954257993f, -0.31791913188064f}, {-0.83782144651251f,  0.97637632547466f},
		{ 0.33454804933804f, -0.86231516800408f}, {-0.99707579362824f,  0.93237990079441f},
		{-0.22827527843994f,  0.18874759397997f}, { 0.67248046289143f, -0.03646211390569f},
		{-0.05146538187944f, -0.92599700120679f}, { 0.99947295749905f,  0.93625229707912f},
		{ 0.66951124390363f,  0.98905825623893f}, {-0.99602956559179f, -0.44654715757688f},
		{ 0.82104905483590f,  0.99540741724928f}, { 0.99186510988782f,  0.72023001312947f},
		{-0.65284592392918f,  0.52186723253637f}, { 0.93885443798188f, -0.74895312615259f},
		{ 0.96735248738388f,  0.90891816978629f}, {-0.22225968841114f,  0.57124029781228f},
		{-0.44132783753414f, -0.92688840659280f}, {-0.85694974219574f,  0.88844532719844f},
		{ 0.91783042091762f, -0.46356892383970f}, { 0.72556974415690f, -0.99899555770747f},
		{-0.99711581834508f,  0.58211560180426f}, { 0.77638976371966f,  0.94321834873819f},
		{ 0.07717324253925f,  0.58638399856595f}, {-0.56049829194163f,  0.82522301569036f},
		{ 0.98398893639988f,  0.39467440420569f}, { 0.47546946844938f,  0.68613044836811f},
		{ 0.65675089314631f,  0.18331637134880f}, { 0.03273375457980f, -0.74933109564108f},
		{-0.38684144784738f,  0.51337349030406f}, {-0.97346267944545f, -0.96549364384098f},
		{-0.53282156061942f, -0.91423265091354f}, { 0.99817310731176f,  0.61133572482148f},
		{-0.50254500772635f, -0.88829338134294f}, { 0.01995873238855f,  0.85223515096765f},
		{ 0.99930381973804f,  0.94578896296649f}, { 0.82907767600783f, -0.06323442598128f},
		{-0.58660709669728f,  0.96840773806582f}, {-0.17573736667267f, -0.48166920859485f},
		{ 0.83434292401346f, -0.13023450646997f}, { 0.05946491307025f,  0.20511047074866f},
		{ 0.81505484574602f, -0.94685947861369f}, {-0.44976380954860f,  0.40894572671545f},
		{-0.89746474625671f,  0.99846578838537f}, { 0.39677256130792f, -0.74854668609359f},
		{-0.07588948563079f,  0.74096214084170f}, { 0.76343198951445f,  0.41746629422634f},
		{-0.74490104699626f,  0.94725911744610f}, { 0.64880119792759f,  0.41336660830571f},
		{ 0.62319537462542f, -0.93098313552599f}, { 0.42215817594807f, -0.07712787385208f},
		{ 0.02704554141885f, -0.05417518053666f}, { 0.80001773566818f,  0.91542195141039f},
		{-0.79351832348816f, -0.36208897989136f}, { 0.63872359151636f,  0.08128252493444f},
		{ 0.52890520960295f,  0.60048872455592f}, { 0.74238552914587f,  0.04491915291044f},
		{ 0.99096131449250f, -0.19451182854402f}, {-0.80412329643109f, -0.88513818199457f},
		{-0.64612616129736f,  0.72198674804544f}, { 0.11657770663191f, -0.83662833815041f},
		{-0.95053182488101f, -0.96939905138082f}, {-0.62228872928622f,  0.82767262846661f},
		{ 0.03004475787316f, -0.99738896333384f}, {-0.97987214341034f,  0.36526129686425f},
		{-0.99986980746200f, -0.36021610299715f}, { 0.89110648599879f, -0.97894250343044f},
		{ 0.10407960510582f,  0.77357793811619f}, { 0.95964737821728f, -0.35435818285502f},
		{ 0.50843233159162f,  0.96107691266205f}, { 0.17006334670615f, -0.76854025314829f},
		{ 0.25872675063360f,  0.99893303933816f}, {-0.01115998681937f,  0.98496019742444f},
		{-0.79598702973261f,  0.97138411318894f}, {-0.99264708948101f, -0.99542822402536f},
		{-0.99829663752818f,  0.01877138824311f}, {-0.70801016548184f,  0.33680685948117f},
		{-0.70467057786826f,  0.93272777501857f}, { 0.99846021905254f, -0.98725746254433f},
		{-0.63364968534650f, -0.16473594423746f}, {-0.16258217500792f, -0.95939125400802f},
		{-0.43645594360633f, -0.94805030113284f}, {-0.99848471702976f,  0.96245166923809f},
		{-0.16796458968998f, -0.98987511890470f}, {-0.87979225745213f, -0.71725725041680f},
		{ 0.44183099021786f, -0.93568974498761f}, { 0.93310180125532f, -0.99913308068246f},
		{-0.93941931782002f, -0.56409379640356f}, {-0.88590003188677f,  0.47624600491382f},
		{ 0.99971463703691f, -0.83889954253462f}, {-0.75376385639978f,  0.00814643438625f},
		{ 0.93887685615875f, -0.11284528204636f}, { 0.85126435782309f,  0.52349251543547f},
		{ 0.39701421446381f,  0.81779634174316f}, {-0.37024464187437f, -0.87071656222959f},
		{-0.36024828242896f,  0.34655735648287f}, {-0.93388812549209f, -0.84476541096429f},
		{-0.65298804552119f, -0.18439575450921f}, { 0.11960319006843f,  0.99899346780168f},
		{ 0.94292565553160f,  0.83163906518293f}, { 0.75081145286948f, -0.35533223142265f},
		{ 0.56721979748394f, -0.24076836414499f}, { 0.46857766746029f, -0.30140233457198f},
		{ 0.97312313923635f, -0.99548191630031f}, {-0.38299976567017f,  0.98516909715427f},
		{ 0.41025800019463f,  0.02116736935734f}, { 0.09638062008048f,  0.04411984381457f},
		{-0.85283249275397f,  0.91475563922421f}, { 0.88866808958124f, -0.99735267083226f},
		{-0.48202429536989f, -0.96805608884164f}, { 0.27572582416567f,  0.58634753335832f},
		{-0.65889129659168f,  0.58835634138583f}, { 0.98838086953732f,  0.99994349600236f},
		{-0.20651349620689f,  0.54593044066355f}, {-0.62126416356920f, -0.59893681700392f},
		{ 0.20320105410437f, -0.86879180355289f}, {-0.97790548600584f,  0.96290806999242f},
		{ 0.11112534735126f,  0.21484763313301f}, {-0.41368337314182f,  0.28216837680365f},
		{ 0.24133038992960f,  0.51294362630238f}, {-0.66393410674885f, -0.08249679629081f},
		{-0.53697829178752f, -0.97649903936228f}, {-0.97224737889348f,  0.22081333579837f},
		{ 0.87392477144549f, -0.12796173740361f}, { 0.19050361015753f,  0.01602615387195f},
		{-0.46353441212724f, -0.95249041539006f}, {-0.07064096339021f, -0.94479803205886f},
		{-0.92444085484466f, -0.10457590187436f}, {-0.83822593578728f, -0.01695043208885f},
		{ 0.75214681811150f, -0.99955681042665f}, {-0.42102998829339f,  0.99720941999394f},
		{-0.72094786237696f, -0.35008961934255f}, { 0.78843311019251f,  0.52851398958271f},
		{ 0.97394027897442f, -0.26695944086561f}, { 0.99206463477946f, -0.57010120849429f},
		{ 0.76789609461795f, -0.76519356730966f}, {-0.82002421836409f, -0.73530179553767f},
		{ 0.81924990025724f,  0.99698425250579f}, {-0.26719850873357f,  0.68903369776193f},
		{-0.43311260380975f,  0.85321815947490f}, { 0.99194979673836f,  0.91876249766422f},
		{-0.80692001248487f, -0.32627540663214f}, { 0.43080003649976f, -0.21919095636638f},
		{ 0.67709491937357f, -0.95478075822906f}, { 0.56151770568316f, -0.70693811747778f},
		{ 0.10831862810749f, -0.08628837174592f}, { 0.91229417540436f, -0.65987351408410f},
		{-0.48972893932274f,  0.56289246362686f}, {-0.89033658689697f, -0.71656563987082f},
		{ 0.65269447475094f,  0.65916004833932f}, { 0.67439478141121f, -0.81684380846796f},
		{-0.47770832416973f, -0.16789556203025f}, {-0.99715979260878f, -0.93565784007648f},
		{-0.90889593602546f,  0.62034397054380f}, {-0.06618622548177f, -0.23812217221359f},
		{ 0.99430266919728f,  0.18812555317553f}, { 0.97686402381843f, -0.28664534366620f},
		{ 0.94813650221268f, -0.97506640027128f}, {-0.95434497492853f, -0.79607978501983f},
		{-0.49104783137150f,  0.32895214359663f}, { 0.99881175120751f,  0.88993983831354f},
		{ 0.50449166760303f, -0.85995072408434f}, { 0.47162891065108f, -0.18680204049569f},
		{-0.62081581361840f,  0.75000676218956f}, {-0.43867015250812f,  0.99998069244322f},
		{ 0.98630563232075f, -0.53578899600662f}, {-0.61510362277374f, -0.89515019899997f},
		{-0.03841517601843f, -0.69888815681179f}, {-0.30102157304644f, -0.07667808922205f},
		{ 0.41881284182683f,  0.02188098922282f}, {-0.86135454941237f,  0.98947480909359f},
		{ 0.67226861393788f, -0.13494389011014f}, {-0.70737398842068f, -0.76547349325992f},
		{ 0.94044946687963f,  0.09026201157416f}, {-0.82386352534327f,  0.08924768823676f},
		{-0.32070666698656f,  0.50143421908753f}, { 0.57593163224487f, -0.98966422921509f},
		{-0.36326018419965f,  0.07440243123228f}, { 0.99979044674350f, -0.14130287347405f},
		{-0.92366023326932f, -0.97979298068180f}, {-0.44607178518598f, -0.54233252016394f},
		{ 0.44226800932956f,  0.71326756742752f}, { 0.03671907158312f,  0.63606389366675f},
		{ 0.52175424682195f, -0.85396826735705f}, {-0.94701139690956f, -0.01826348194255f},
		{-0.98759606946049f,  0.82288714303073f}, { 0.87434794743625f,  0.89399495655433f},
		{-0.93412041758744f,  0.41374052024363f}, { 0.96063943315511f,  0.93116709541280f},
		{ 0.97534253457837f,  0.86150930812689f}, { 0.99642466504163f,  0.70190043427512f},
		{-0.94705089665984f, -0.29580042814306f}, { 0.91599807087376f, -0.98147830385781f},
		// Start of duplicated table
		{-0.99948153278296f, -0.59483417516607f}, { 0.97113454393991f, -0.67528515225647f},
		{ 0.14130051758487f, -0.95090983575689f}, {-0.47005496701697f, -0.37340549728647f},
		{ 0.80705063769351f,  0.29653668284408f}, {-0.38981478896926f,  0.89572605717087f},
		{-0.01053049862020f, -0.66959058036166f}, {-0.91266367957293f, -0.11522938140034f},
	};
}
