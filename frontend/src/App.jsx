import { useState } from "react";
import generateVideo from "./api";

const App = () => {
  const [description, setDescription] = useState("");
  const [videoPath, setVideoPath] = useState("");

  const handleGenerate = async () => {
    try {
      const path = await generateVideo(description);
      setVideoPath(path);
    } catch {
      alert("Failed to generate video");
    }
  };

  return (
    <div>
      <h1>AI Video Generator</h1>
      <input
        type="text"
        placeholder="Enter video description"
        value={description}
        onChange={(e) => setDescription(e.target.value)}
      />
      <button onClick={handleGenerate}>Generate Video</button>
      {videoPath && (
        <video controls>
          <source src={`http://localhost:3000/${videoPath}`} type="video/mp4" />
          Your browser does not support the video tag.
        </video>
        )}
        </div>
      )}
export default App
