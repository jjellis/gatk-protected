/*
 * Copyright (c) 2012, The Broad Institute
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */

package org.broadinstitute.sting.gatk.walkers.qc;

import org.broadinstitute.sting.WalkerTest;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * Tests ReadGroupProperties
 */
public class CalibrateGenotypeLikelihoodsIntegrationTest extends WalkerTest {
    @Test
    public void basicTest() {
        WalkerTestSpec spec = new WalkerTestSpec(
                "-T CalibrateGenotypeLikelihoods -R " + b37KGReference +
                        " -I " + b37GoodNA12878BAM +
                        " -alleles " + b37_NA12878_OMNI +
                        " -nt 4 -L 20:10,000,000-15,000,000 -o %s",
                1,
                Arrays.asList("2aa88c4ab6ce982a52ec191d0937bb69"));
        executeTest("CalibrateGenotypeLikelihoods:", spec);
    }

    @Test
    public void externalLikelihoodsTest() {
        WalkerTestSpec spec = new WalkerTestSpec(
                "-T CalibrateGenotypeLikelihoods -R " + b37KGReference +
                        " --externalLikelihoods:testRG " + testDir + "NA12878.hg19.example1.vcf" +
                        " --externalLikelihoods:testRG2 " + testDir + "NA12878.hg19.example1.vcf" +
                        " -alleles " + b37_NA12878_OMNI +
                        " -L 20:10,000,000-15,000,000 -o %s",
                1,
                Arrays.asList("1e93bc5aaea0d01694abe6c7491f011f"));
        executeTest("CalibrateGenotypeLikelihoods:", spec);
    }
}