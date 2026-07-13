package de.jfret.fretparser;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class Fret2LtlCLI {

    public static String toLtlWithFretCli(String input){
        try {
            ProcessBuilder pb = new ProcessBuilder(
                    "bash",
                    "-lc",
                    "export NVM_DIR=\"$HOME/.nvm\" && [ -s \"$NVM_DIR/nvm.sh\" ] && . \"$NVM_DIR/nvm.sh\" && nvm use 20 && " +
                            "npm run start-cli --silent -- formalize -l pt '"+ input +"'"
            );

            pb.directory(new File("/home/orchid/Programme/fret/fret-electron"));
            pb.redirectErrorStream(true);

            Process process = pb.start();

            BufferedReader reader =
                    new BufferedReader(
                            new InputStreamReader(process.getInputStream()));

            String line = reader.readLine();
            line = reader.readLine();
            process.waitFor();
            return line.trim();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
